package as.security;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import as.security.SecurityServiceGrpc.SecurityServiceBlockingStub;
import as.security.SecurityServiceGrpc.SecurityServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SecurityClient{
	
	//private static Logger logger = Logger.getLogger(SecurityClient.class.getName());
	private static SecurityServiceBlockingStub blockingStub;
	private static SecurityServiceStub asyncStub;
	
	public static void main(String args []) {
		
		String host = "localhost";
		int port = 50053;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
			//stubs generated from proto file	
		   blockingStub = SecurityServiceGrpc.newBlockingStub(channel);
		   asyncStub = SecurityServiceGrpc.newStub(channel);
		   new SecurityClient();
		   
	        //timeout
	        Runtime.getRuntime().addShutdownHook(new Thread() {
	            @Override
	            public void run() {
	                try {
	                    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        
	        passportDetails();
	        
	        clearanceDetails();
	        
	        boardingDetails();
	        
	}
		//bi-directional streaming RPC
	private static void passportDetails() {
		
		StreamObserver<ResponseDetails> responseObserver = new StreamObserver<ResponseDetails>() {

			public void onNext(ResponseDetails value) {
				
				//  method stub
				System.out.println("Passport name: " +value.getResponseMessage());
				
			}
			public void onError(Throwable t) {
				//  method stub
				
			}

			public void onCompleted() {
				// method stub
				System.out.println("Server completed");
			}
			
		};
		//requestObserver is carrying all the streams of messages
		StreamObserver<RequestDetails> requestObserver = asyncStub.passportDetails(responseObserver);
		
	try {
			requestObserver.onNext(RequestDetails.newBuilder().setName("John Smith").build());
			requestObserver.onNext(RequestDetails.newBuilder().setName("Mary Smith").build());
			requestObserver.onNext(RequestDetails.newBuilder().setName("Jim Smith").build());
			requestObserver.onNext(RequestDetails.newBuilder().setName("Jane Smith").build());
			requestObserver.onNext(RequestDetails.newBuilder().setName("Molly Smith").build());
			
			System.out.println("SENDING MESSAGES");
			
			// Mark the end of requests
			requestObserver.onCompleted();
			System.out.println("Server completed the task");
			
			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);
			
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		//client streaming RPC
	private static void clearanceDetails() {
		
		StreamObserver<ResponseClearance> responseObserver = new StreamObserver<ResponseClearance>() {

		
			
			public void onNext(ResponseClearance value) {
				
				//  method stub
				System.out.println("Passports received are " +value.getMessage());
				
			}


			public void onCompleted() {
				// method stub
				System.out.println("Server completed the task");
			}
			public void onError(Throwable t) {
				//  method stub
				
			}
			
		};
		//requestObserver is carrying all the streams of messages
		StreamObserver<RequestClearance> requestObserver = asyncStub.clearanceDetails(responseObserver);
		
		
		
	try {
			requestObserver.onNext(RequestClearance.newBuilder().setName("John Smith").setPassportNo(45).build());
			requestObserver.onNext(RequestClearance.newBuilder().setName("Mary Smith").setPassportNo(101).build());
			requestObserver.onNext(RequestClearance.newBuilder().setName("Jim Smith").setPassportNo(18).build());
			requestObserver.onNext(RequestClearance.newBuilder().setName("Jane Smith").setPassportNo(15).build());
			requestObserver.onNext(RequestClearance.newBuilder().setName("Molly Smith").setPassportNo(10).build());
			
			System.out.println("SENDING MESSAGES");
			
			// Mark the end of requests
			requestObserver.onCompleted();
			
			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);
			
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

		
	
		//client streaming RPC
	private static void boardingDetails() {
		// TODO Auto-generated method stub
		
	}
	
}