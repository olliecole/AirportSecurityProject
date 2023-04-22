package as.userAccess;

import java.io.IOException;
import java.util.logging.Logger;
import as.userAccess.userAccessServiceGrpc.userAccessServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class UserAccessSever extends userAccessServiceImplBase{
	private static final Logger logger = Logger.getLogger(UserAccessSever.class.getName());
	
		public static void main(String args[]) {
			
			UserAccessSever UserAccessserver = new UserAccessSever();
			int port = 50051;
			
			try {
				Server server = ServerBuilder.forPort(port)
					    .addService(UserAccessserver)
					    .build()
					    .start();
				
				 logger.info("Server started, listening on " + port);
				 
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
			 System.out.println("Goodbye " + request1.getUsername());
			 LogoutResponse response = LogoutResponse.newBuilder().setResponseMessage("Goodbye " + request1.getUsername()).build();
			 responseObserver.onNext(response);
			 responseObserver.onCompleted();
		 }
		
		}
	
	
