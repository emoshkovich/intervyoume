import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Intervyoume {
	private JPanel mainPanel;
	private JPanel videoPanel;
	private Color purple = new Color(165, 197, 250);

	public JPanel mainPanel() {
		mainPanel = new JPanel();
		mainPanel.setBackground(purple);
		mainPanel.setLayout(new BorderLayout(100, 100));
		Border b = BorderFactory.createLineBorder(new Color(0, 0, 102), 7);
		mainPanel.setBorder(b);
		JLabel welcome = new JLabel("Welcome to Intervyou.me!", JLabel.CENTER);
		welcome.setFont(new Font("Monaco", Font.BOLD, 50));
		welcome.setForeground(new Color(0, 0, 102));
		mainPanel.add(welcome, BorderLayout.NORTH);
		mainPanel.add(videoPanel(), BorderLayout.CENTER);
		mainPanel.add(categoriesPanel(), BorderLayout.SOUTH);

		return mainPanel;

	}

	private JPanel categoriesPanel() {
		JPanel categories = new JPanel();
		categories.setBackground(purple);
		JButton newU = new JButton("New User");
		JButton oldU = new JButton("Returning");
		oldU.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				mainPanel.removeAll();
				mainPanel.updateUI();
				videoPanel.removeAll();
				videoPanel.updateUI();
				mainPanel.add(videoPanel(), BorderLayout.CENTER);
				ImageIcon cal = new ImageIcon("Calendar.png");
				JLabel calL = new JLabel(cal, JLabel.CENTER);
				videoPanel.add(calL);
			}
			
		});
		
		newU.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			GetStarted start = new GetStarted();
			mainPanel.removeAll();
			mainPanel.updateUI();
			mainPanel.add(start.getXP());
		}
	});
		
		categories.add(newU);
		categories.add(oldU);
		return categories;
	}

	private JPanel quotesPanel() {
		JPanel quotePanel = new JPanel();
		quotePanel.setBackground(new Color(0, 220, 250));
		quotePanel.setLayout(new GridBagLayout());
		
		return quotePanel;
	}

	private JPanel videoPanel() {
		videoPanel = new JPanel();
		videoPanel.setBackground(purple);
		
		return videoPanel;
	}
}