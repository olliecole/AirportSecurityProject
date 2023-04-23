package as.userAccess;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import as.userAccess.userAccessServiceGrpc.userAccessServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class UserAccessSever extends userAccessServiceImplBase{
	private static final Logger logger = Logger.getLogger(UserAccessSever.class.getName());
	
		public static void main(String args[]) {
			
			UserAccessSever UserAccessserver = new UserAccessSever();
			  Properties prop = UserAccessserver.getProperties();

			  UserAccessserver.registerService(prop);

		        int port = Integer.parseInt(prop.getProperty("service_port")); // port number 50051
			
			try {
				Server server = ServerBuilder.forPort(port)
					    .addService(UserAccessserver)
					    .build()
					    .start();
				
				 logger.info("UserAccess Server started, listening on " + port);
				 
					 server.awaitTermination();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
	            int service_port = Integer.parseInt(prop.getProperty("service_port"));// #.50051;

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

	        try (InputStream input = Files.newInputStream(Paths.get("src/main/resources/userAccess.properties"))) {

	            prop = new Properties();

	            // load a properties file(userAccess.properties)
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
		//unary RPC
		 public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
			    
		    	System.out.println("Receiving login request");
		    	System.out.println("Hello " + request.getUsername());
		    	LoginResponse response = LoginResponse.newBuilder().setResponseMessage("Welcome " + request.getUsername()).build();
		    			    
		    	responseObserver.onNext(response);
		    	responseObserver.onCompleted();
		    	
		    }
		 //unary RPC
		 public void logout(LogoutRequest request1, StreamObserver<LogoutResponse>responseObserver) {
			 System.out.println("Receiving logout request.");
			// if(username == "olliecole")
			 System.out.println("Goodbye " + request1.getUsername());
			 LogoutResponse response = LogoutResponse.newBuilder().setResponseMessage("Goodbye " + request1.getUsername()).build();
			 responseObserver.onNext(response);
			 responseObserver.onCompleted();
		 }
		
		}
	
	
