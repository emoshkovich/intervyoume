import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ProfilePage {
	protected JPanel xPanel;
	protected RegisteredUser user;
	
	public ProfilePage(RegisteredUser user){
		super();
		this.user=user;
		
	}

	public JLabel userName(){
		JLabel user=new JLabel("Charu Sharma");
		 user.setForeground( Color.BLACK);
		 user.setOpaque(true);
		 return user;
		
	}
	
}
