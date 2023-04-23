package as.security;

import java.awt.Dimension;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import as.security.SecurityServiceGrpc.SecurityServiceBlockingStub;
import as.security.SecurityServiceGrpc.SecurityServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SecurityClient extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static Logger logger = Logger.getLogger(SecurityClient.class.getName());
	private static SecurityServiceBlockingStub blockingStub;
	private static SecurityServiceStub asyncStub;
	private static String SERVICE_HOST = "localhost";
    private static int SERVICE_PORT = 50053;
    
    public SecurityClient() {
    	
super("Security Service");
    	
        JLabel usernameLabel = new JLabel("Enter passport name");
        JTextField userInput = new JTextField(10);
        JLabel passportLabe1 = new JLabel("Enter passport number");
        JTextField passportNoInput = new JTextField(10);
        
        JButton login = new JButton("Run check");
        login.addActionListener(e -> {
			passportDetails();
		});
        
      

        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(userInput);
        panel.add(login);
        panel.add(passportLabe1);
        panel.add(passportNoInput);
        panel.add(login);       
        JTextArea text = new JTextArea(10, 30);                
        panel.add(new JScrollPane(text));
        add(panel);
        
    

        // Set the preferred size of the frame
        setPreferredSize(new Dimension(450, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    	
    }
    
	
	public static void main(String args []) throws Exception{
		
        // Create an instance of JmDNS and bind it to a specific network interface given its IP-address
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        String SERVICE_TYPE = "passportSecurity._tcp.local.";
        String SERVICE_NAME = "SecurityService";
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
		
			//stubs generated from .proto file	
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