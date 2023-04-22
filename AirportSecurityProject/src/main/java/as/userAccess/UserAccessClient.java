package as.userAccess;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import as.userAccess.userAccessServiceGrpc.userAccessServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UserAccessClient{
	
	private static final Logger logger = Logger.getLogger(UserAccessClient.class.getName());
	private static userAccessServiceBlockingStub blockingStub;
	
	public static void main(String [] args) throws Exception{
		
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		//stub generated from proto file
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
		}catch (RuntimeException e) {
            e.printStackTrace();
        }
	} 
	
	
	
}
		
		
