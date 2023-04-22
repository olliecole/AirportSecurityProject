package as.surveillance;

import java.io.IOException;
import java.util.logging.Logger;
import as.surveillance.surveillanceServiceGrpc.surveillanceServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class SurveillanceServer extends surveillanceServiceImplBase{
	private static final Logger logger = Logger.getLogger(SurveillanceServer.class.getName());
	
	
	public static void main(String args[]) {
		
		SurveillanceServer SurveillanceServer = new SurveillanceServer();
		int port = 50052;
		
		try {
			Server server = ServerBuilder.forPort(port)
				    .addService(SurveillanceServer)
				    .build()
				    .start();
			
			
			 logger.info("Surveillance Server started, listening on " + port);
			 
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
	public void access(accessRequest request, StreamObserver<accessResponse> responseObserver) {
		
		System.out.println("Receiving door access request");
		int code = 1234;
		if(code == 1234) {
			System.out.println("Access Granted " + request.getCode() + " is correct");
		}else {
			System.out.println("Access Denied " + request.getCode() + " is incorrect");
		}
		//
		accessResponse response = accessResponse.newBuilder().setMessage("Enter " + request.getCode()).build();
    	
		responseObserver.onNext(response);
		
    	responseObserver.onCompleted();
	}
		
	}
	
