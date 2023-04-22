package as.client;


import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import as.security.SecurityServiceGrpc;
import as.surveillance.surveillanceServiceGrpc;
import as.userAccess.userAccessServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class ControllerGUI implements ActionListener{


	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	


	private JPanel getSecurityServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Security Service");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getSurveillanceServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Surveillance Service");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getUserAccessServiceJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke User Access Service");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}

	

	
	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getSecurityServiceJPanel() );
		panel.add( getSurveillanceServiceJPanel() );
		panel.add( getUserAccessServiceJPanel() );
		

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Security Service")) {
			System.out.println("Security Service to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			SecurityServiceGrpc.SecurityServiceBlockingStub blockingStub = SecurityServiceGrpc.newBlockingStub(channel);

			//preparing message to send
		//	as.security.RequestDetails request = as.security.RequestDetails.newBuilder().setText(entry1.getText()).build();

			//retreving reply from service
			//as.security.ResponseDetails response = blockingStub.securityDo(request);

			//reply1.setText( String.valueOf( response.getLength()) );
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			surveillanceServiceGrpc.surveillanceServiceBlockingStub blockingStub = surveillanceServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			//as.surveillance.RequestClearance request = as.surveillance.RequestClearance.newBuilder().setText(entry2.getText()).build();

			//retreving reply from service
		//	as.surveillance.ResponseClearance response = blockingStub.as.surveillanceDo(request);

		//	reply2.setText( String.valueOf( response.getLength()) );
			
		//}else (label.equals("Invoke Service 3")) {
			System.out.println("service 3 to be invoked ...");

		
			/*
			 * 
			 */
			//ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			//userAccessServiceGrpc.userAccessServiceBlockingStub blockingStub = userAccessServiceGrpc.newBlockingStub(channel);

			//preparing message to send
			//as.userAccess.RequestMessage request = as.userAccess.RequestMessage.newBuilder().setText(entry3.getText()).build();

			//retreving reply from service
			//as.userAccess.ResponseMessage response = blockingStub.service3Do(request);

		//	reply3.setText( String.valueOf( response.getLength()) );
		
		}//else{
			
		}

	}

//}
