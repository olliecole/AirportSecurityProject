package as.userAccess;

import java.awt.Dimension;
import java.net.InetAddress;
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

import as.userAccess.userAccessServiceGrpc.userAccessServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UserAccessClient extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(UserAccessClient.class.getName());
	private static userAccessServiceBlockingStub blockingStub;
	private static String SERVICE_HOST = "localhost";
    private static int SERVICE_PORT = 50051;
    private static JTextField userInput;
    private static JTextField passwordInput;
    private static JTextArea text;
    
    public UserAccessClient() {
    	super("User Login Service");
    	
        JLabel usernameLabel = new JLabel("Enter Username");
        JLabel passwordLabe1 = new JLabel("Enter password");
        userInput = new JTextField(10);
        
        JButton login = new JButton("Login");
        login.addActionListener(e -> {
			try {
				login();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
        
        JLabel usernameoutLabel = new JLabel("Enter Username");
        passwordInput = new JTextField(10);
        
        JButton logout = new JButton("Logout");
        logout.addActionListener(e -> logout());

        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(userInput);
        panel.add(passwordLabe1);
        panel.add(userInput);
        panel.add(login);
        text = new JTextArea(10, 30);
        panel.add(new JScrollPane(text));

        add(panel);
        JPanel panel1 = new JPanel();
        panel.add(usernameoutLabel);
        panel.add(passwordInput);
        panel.add(logout);
        text = new JTextArea(10, 30);
        panel.add(new JScrollPane(text));

        add(panel);

        // Set the preferred size of the frame
        setPreferredSize(new Dimension(500, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    	
    }
	
	public static void main(String [] args) throws Exception{
		
        // Create an instance of JmDNS and bind it to a specific network interface given its IP-address
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        String SERVICE_TYPE = "LoginAccess._tcp.local.";
        String SERVICE_NAME = "userAccessService";
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
		//stub generated from .proto file
		 blockingStub = userAccessServiceGrpc.newBlockingStub(channel);
		  new UserAccessClient();
		  
	        //Timeout
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
		  
		 login();
		 
		 logout();
		 
	}
	//unary RPC
	//login method
	private static void login() throws InterruptedException {
		 String username = "olliecole" ;
		 String password = "0000";
		 System.out.println("UserAccess Login Interface");
		 
		 try {
		LoginRequest request = LoginRequest.newBuilder().setUsername(username).setPassword(password).build();	
		LoginResponse response = blockingStub.login(request);
		logger.info("Hello " + response.getResponseMessage() + " your login was successful.");
		text.setText(response.getResponseMessage() + "\n");
		 }catch (RuntimeException e) {
             e.printStackTrace();
         }
		 }
		 
	
	//unary RPC
	//logout method
	private static void logout() {
		String username = "olliecole" ;
		try {
		LogoutRequest request1 = LogoutRequest.newBuilder().setUsername(username).build();
		LogoutResponse response1 = blockingStub.logout(request1);
		logger.info("Logout complete. " + response1.getResponseMessage());
		text.setText(response1.getResponseMessage() + "\n");
		}catch (RuntimeException e) {
            e.printStackTrace();
        }
	} 
	
	
	
}
		
		
