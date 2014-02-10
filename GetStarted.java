import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;



public class GetStarted extends JPanel{

	protected RegisteredUser user;
	private ProfilePage profilePage;
	private String[] indStrings = { "Finance","Consulting","Engineering","Social service", "Other..."};
	private String[] uniStrings = { "Brown","Harvard", "MIT","Mount Holyoke", "RIT","Smith", "Stanford", "Wellesley", "Yale", "Other..."}; 
	private ImageIcon profile;
	private ImageIcon imageB;
	private static JPanel xPanel;
	private BorderLayout layout;
	protected static JFrame f;
	
	/**
	* @param args
	
	public static void main(String[] args) {
	// Auto-generated method stub

	try {
	UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName());
	}catch (Exception e) {
	}

	f= new JFrame("IntervYou.Me");
	f.setSize(800, 500);

	GetStarted mainPanel = new GetStarted();

	f.add(xPanel);
	//f.show( true );

	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	*/
	public GetStarted(){
		super();
		user=new RegisteredUser();
		profilePage=new ProfilePage(user);
		imageB = new ImageIcon("register.png");
		xPanel=new JPanel(new BorderLayout());
		xPanel.setBackground( new Color(200, 200, 250));
		ImageIcon image = new ImageIcon("fillProf.jpg");
		ImageIcon userPic = new ImageIcon("user.png");
		JLabel userLabel = new JLabel("", userPic, JLabel.CENTER);
		JLabel labelImage = new JLabel("", image, JLabel.CENTER);
		xPanel.add(createInfoPanel(), BorderLayout.CENTER);
		xPanel.add(userLabel, BorderLayout.WEST);
		xPanel.add(labelImage, BorderLayout.NORTH);
		xPanel.add(registerButton(), BorderLayout.SOUTH);
		layout = (BorderLayout) xPanel.getLayout();	
	}
	public JPanel getXP(){
		return xPanel;
	}

	public JPanel createInfoPanel(){
		JPanel panel = new JPanel();
		//panel.setSize(xPanel.getWidth(), 150);
		panel.setLayout(new GridBagLayout());
		panel.setBackground( new Color(200, 200, 250));
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		panel.add(new JLabel("Name:"), c);
		c.gridx = 1;
		c.gridy = 0;
		JTextField name=new JTextField(" 		");
		panel.add(name, c);
		user.setName(name.getText());
		
		c.gridx = 0;
		c.gridy = 1;
		panel.add(new JLabel("Last Name:  "), c);
		c.gridx = 1;
		c.gridy = 1;
		JTextField last=new JTextField(" 		");
		panel.add(last, c);
		user.setName(last.getText());
		
		
		c.gridx = 0;
		c.gridy = 2;
		panel.add(new JLabel("email:  "), c);
		c.gridx = 1;
		c.gridy = 2;
		JTextField email=new JTextField(" 		");
		panel.add(email, c);
		user.setEmail(email.getText());
		
		c.gridx = 0;
		c.gridy = 3;
		panel.add(new JLabel("Password:  "), c);
		c.gridx = 1;
		c.gridy = 3;
		JTextField pass=new JTextField(" 		");
		panel.add(pass, c);
		user.setPassword(pass.getText());
		
		c.gridx = 0;
		c.gridy = 4;
		panel.add(new JLabel("Confirm Password:  "), c);
		c.gridx = 1;
		c.gridy = 4;
		panel.add(new JTextField(" 		"), c);
		c.gridx = 0;
		c.gridy = 5;
		panel.add(new JLabel("Industry of Interest:  "), c);
		c.gridx = 1;
		c.gridy = 5;
		final JComboBox indList = new JComboBox(indStrings);
		indList.setSelectedIndex(4);
		indList.addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				user.setIndustry(indList.getSelectedItem().toString());
			}
	        });
		panel.add(indList, c);
		c.gridx = 0;
		c.gridy = 6;
		panel.add(new JLabel("University:  "), c);
		c.gridx = 1;
		c.gridy = 6;
		final JComboBox uniList = new JComboBox(uniStrings);
		uniList.setSelectedIndex(9);
		uniList.addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				user.setUniversity(uniList.getSelectedItem().toString());
			}
	        });
		panel.add(uniList, c);
		return panel;
	}
	
	public JPanel registerButton(){
		JPanel panel = new JPanel();
		panel.setBackground( new Color(200, 200, 250));
		// create a button
	    JButton rButton = new JButton( imageB);
	    rButton.setBackground( new Color(200, 200, 250));
	    rButton.setOpaque(true);
	    rButton.setBorderPainted(false);
	    // add an action listener for button's action (click)
	    rButton.addActionListener(
	        new ActionListener()
	        {
	          /**
	           * Invoked when associated action is performed.
	           **/
	          public void actionPerformed( ActionEvent e )
	          {
	            // this is where you put the code you want
	            // executed when the button is pressed
	            // here, we call a method to update the display 
	        	  //remove and change the panel
	        	 // System.out.println(user.getName()+user.getLastName());	        	
	        	  xPanel.removeAll();
	        	xPanel.updateUI();
	        	xPanel.add(createPanel(), BorderLayout.CENTER);
	        	//f.revalidate();

	        	
	          }
	        }
	        );
	    panel.add(rButton);
	    return panel;
	}
	
	public JPanel createPanel(){
		xPanel=new JPanel(new BorderLayout());
		xPanel.setBackground( new Color(200, 200, 250));
		
		//xPanel.setBackground(Color.BLUE);
		ImageIcon userPic = new ImageIcon("profile.jpg");
		JLabel userLabel = new JLabel(userPic, JLabel.CENTER);
		xPanel.add(userLabel, BorderLayout.CENTER);
		//xPanel.add(userName(), BorderLayout.NORTH);
		
		return xPanel;	
	}

}
