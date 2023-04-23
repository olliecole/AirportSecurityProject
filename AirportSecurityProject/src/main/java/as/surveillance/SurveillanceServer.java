package as.surveillance;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import as.surveillance.surveillanceServiceGrpc.surveillanceServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class SurveillanceServer extends surveillanceServiceImplBase{
	private static final Logger logger = Logger.getLogger(SurveillanceServer.class.getName());
	
	
	public static void main(String args[]) {
		
		SurveillanceServer SurveillanceServer = new SurveillanceServer();
		 Properties prop = SurveillanceServer.getProperties();

		 SurveillanceServer.registerService(prop);
		int port = Integer.parseInt(prop.getProperty("service_port")); // port number 50052;
		
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

        try (InputStream input = Files.newInputStream(Paths.get("src/main/resources/surveillance.properties"))) {

            prop = new Properties();

            // load a properties file(userAccess.properties)
            prop.load(input);

            // get the property value and print it out
            System.out.println("Surveillance Service properies");
            System.out.println("\t service_type: " + prop.getProperty("service_type"));
            System.out.println("\t service_name: " + prop.getProperty("service_name"));
            System.out.println("\t service_description: " + prop.getProperty("service_description"));
            System.out.println("\t service_port: " + prop.getProperty("service_port"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop;
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
	
