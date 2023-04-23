package as.security;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import as.security.SecurityServiceGrpc.SecurityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Properties;
import java.util.Random;

public class SecurityServer extends SecurityServiceImplBase{
	private static final Logger logger = Logger.getLogger(SecurityServer.class.getName());
	
	
	public static void main(String args []) {
		
		SecurityServer SecurityServer = new SecurityServer();
		 Properties prop = SecurityServer.getProperties();

		 SecurityServer.registerService(prop);

	        int port = Integer.parseInt(prop.getProperty("service_port")); // port number 50053
		
		
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
	
	private void registerService(Properties prop) {
		// TODO Auto-generated method stub
        try {
            // Create an instance of JmDNS and bind it to a specific network interface given its IP-address
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            String service_type = prop.getProperty("service_type");// "_http._tcp.local.";
            String service_name = prop.getProperty("service_name");// "example";
            int service_port = Integer.parseInt(prop.getProperty("service_port"));// #.50053;

            String service_description_properties = prop.getProperty("service_description");//

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
                    service_description_properties);
            jmdns.registerService(serviceInfo);

            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

            /* Causes the currently executing thread to sleep (temporarily ceaseexecution)
            for the specified number of milliseconds*/
            Thread.sleep(1000);

            // Unregister all services
            // jmdns.unregisterAllServices();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}

	private Properties getProperties() {
		// TODO Auto-generated method stub
		 Properties prop = null;

	        try (InputStream input = Files.newInputStream(Paths.get("src/main/resources/security.properties"))) {

	            prop = new Properties();

	            // load a properties file(security.properties)
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("userAccess Service properies");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " + prop.getProperty("service_name"));
	            System.out.println("\t service_description: " + prop.getProperty("service_description"));
	            System.out.println("\t service_port: " + prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	        return prop;
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
	
