package as.surveillance;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import as.surveillance.surveillanceServiceGrpc.surveillanceServiceBlockingStub;
import as.surveillance.surveillanceServiceGrpc.surveillanceServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SurveillanceClient{
	
	
	
	private static final Logger logger = Logger.getLogger(SurveillanceClient.class.getName());
	private static surveillanceServiceBlockingStub blockingStub;
	private static surveillanceServiceStub asyncStub;
	public static void main(String args[]){
	
		String host = "localhost";
		int port = 50052;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
			//stubs generated from proto file	
		   blockingStub = surveillanceServiceGrpc.newBlockingStub(channel);
		   asyncStub = surveillanceServiceGrpc.newStub(channel);
		  new SurveillanceClient();
		  
		  
		  
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
		  
		 access();
		 
		 camera();
		 
		 fire();
		
	}
	//unary RPC
	private static void access() {
		int code = 1234;
		System.out.println("Door Access Interface");
		
		try {
		accessRequest request = accessRequest.newBuilder().setCode(code).build();		
		accessResponse response = blockingStub.access(request);
		logger.info("Door opening, your code " + response.getCode() +  " is valid");
		}catch (RuntimeException e) {
            e.printStackTrace();
        }
	}

	private static void camera() {
		String message;
		
	}

	private static void fire() {
		String message;
		
	}
	
	
}