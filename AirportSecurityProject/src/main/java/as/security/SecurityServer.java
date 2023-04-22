package as.security;

import java.io.IOException;
import java.util.logging.Logger;
import as.security.SecurityServiceGrpc.SecurityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Random;

public class SecurityServer extends SecurityServiceImplBase{
	private static final Logger logger = Logger.getLogger(SecurityServer.class.getName());
	
	
	public static void main(String args []) {
		
		SecurityServer SecurityServer = new SecurityServer();
		int port = 50053;
		
		try {
			Server server = ServerBuilder.forPort(port)
				    .addService(SecurityServer)
				    .build()
				    .start();
			
			
			 logger.info("Security Server started, listening on " + port);
			 
				 server.awaitTermination();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error 1 occured");
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Error 2 occured");
			e.printStackTrace();
		}
	}
	
	public StreamObserver<RequestDetails> passportDetails(StreamObserver<ResponseDetails> responseObserver) {
		return new StreamObserver<RequestDetails>() {
			// method stub
			//get the request
			public void onNext(RequestDetails value) {
				//Logger request = null;
				String input = value.getName();
				ResponseDetails response = ResponseDetails.newBuilder().setResponseMessage(input).build();
				responseObserver.onNext(response);
				System.out.println("Passport name: " + value.getName() + " Irish Passport Holder");
				
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
				
			}
		};
			
		
		
	}
	
	public StreamObserver<RequestClearance> clearanceDetails(StreamObserver<ResponseClearance> responseObserver) {
		
		return new StreamObserver<RequestClearance>() {

			
			String clearanceReply = "";
			String name ="";
			int passportNo = 0;
			public void onNext(RequestClearance value) {
				
				
				
				
				String name = value.getName();
				int passportNo = value.getPassportNo();
				
				if(passportNo > 100) {
					clearanceReply ="Invalid Passport";
				}else if(passportNo == 55) {
					clearanceReply ="Wanted person. Please detain";
				}else {
					clearanceReply ="Valid Passport";
				}
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				ResponseClearance response = ResponseClearance.newBuilder().setMessage(clearanceReply).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				
			}
			
		};
		//System.out.println("Receiving Clearance details access request");
	}
	
	public void boardingDetails() {
		
		System.out.println("Receiving Boarding details access request");
	}
		
		
	}
	
