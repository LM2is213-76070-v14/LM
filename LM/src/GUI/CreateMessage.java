package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class CreateMessage extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public CreateMessage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Updates");
		rdbtnNewRadioButton.setBounds(30, 97, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("General info");
		rdbtnNewRadioButton_1.setBounds(30, 134, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Disruptions");
		rdbtnNewRadioButton_2.setBounds(30, 173, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Create message");
		lblNewLabel.setBounds(30, 57, 98, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea("Här kan man skriva in medd.");
		textArea.setBounds(203, 52, 197, 144);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBounds(316, 217, 89, 23);
		contentPane.add(btnNewButton);
	}
}
