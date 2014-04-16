package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


// TODO: Auto-generated Javadoc
/**
 * The class MySubscriptions is the GUI class that shows the subscription handling.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class MySubscriptions {

	private JPanel contentPane;

	/**
	 * Creates the frame.
	 *
	 * @param mainPanel - the main panel
	 */
	public MySubscriptions(JPanel mainPanel) {
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(450,300));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Updates");
		rdbtnNewRadioButton.setBounds(71, 85, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("General info");
		rdbtnNewRadioButton_1.setBounds(71, 123, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Disruptions");
		rdbtnNewRadioButton_2.setBounds(71, 166, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Choose your subscriptions:");
		lblNewLabel.setBounds(71, 45, 204, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(316, 217, 89, 23);
		contentPane.add(btnNewButton);
		
	}
	
	/**
	 * This method simply returns the whole class as a Panel.
	 *
	 * @return - the panel
	 */
	public JPanel getPanel() {
		return contentPane;
	}
}
