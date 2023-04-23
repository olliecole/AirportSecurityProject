package as.surveillance;

import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import as.surveillance.surveillanceServiceGrpc.surveillanceServiceBlockingStub;
import as.surveillance.surveillanceServiceGrpc.surveillanceServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SurveillanceClient{
	
	
	
	private static final Logger logger = Logger.getLogger(SurveillanceClient.class.getName());
	private static surveillanceServiceBlockingStub blockingStub;
	private static surveillanceServiceStub asyncStub;
	private static String SERVICE_HOST = "localhost";
    private static int SERVICE_PORT = 50052;
	
	public static void main(String args[]) throws IOException{
	
        // Create an instance of JmDNS and bind it to a specific network interface given its IP-address.
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        String SERVICE_TYPE = "airportSurveillance._tcp.local.";
        String SERVICE_NAME = "SurveillanceService";
        ServiceInfo serviceInfo = jmdns.getServiceInfo(SERVICE_TYPE, SERVICE_NAME);
        if (serviceInfo != null) {
            SERVICE_HOST = serviceInfo.getHostAddresses()[0];
            SERVICE_PORT = serviceInfo.getPort();
            System.out.println("Discovered service: " + SERVICE_HOST + ":" + SERVICE_PORT + " ("
                    + serviceInfo.getName() + ")");
        } else {
            System.out.println("Service not found");
        }
        jmdns.close();
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(SERVICE_HOST, SERVICE_PORT)
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