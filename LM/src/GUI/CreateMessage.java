package GUI;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateMessage {

	private JPanel contentPane;

	/**
	 * Constructor
	 */
	public CreateMessage(JPanel mainPanel) {
		createPanel(mainPanel);
	}

	/**
	 * This Method creates the view of all messages
	 */
	public void createPanel(JPanel mainPanel) {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(450,300));

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
		
		JTextField textField = new JTextField();
		textField.setBounds(222, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(338, 42, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("YYYY-MM-DD");
		lblNewLabel_1.setBounds(222, 17, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Headline");
		lblNewLabel_2.setBounds(338, 17, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Write message here");
		lblNewLabel_3.setBounds(222, 73, 109, 14);
		contentPane.add(lblNewLabel_3);
		
	}

	/**
	 * This method simply returns the whole class as a Panel
	 */
	public JPanel getPanel() {
		return contentPane;
	}
}
