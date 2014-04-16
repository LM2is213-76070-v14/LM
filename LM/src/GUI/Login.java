package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * The class Login is the GUI class for the login.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Instantiates a new login.
	 * 
	 */
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(167, 50, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(167, 81, 131, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(96, 53, 61, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(96, 84, 61, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen mainScreen = new MainScreen();
				setVisible(false);
				dispose();
			}
		});
		btnLogin.setBounds(313, 215, 89, 23);
		contentPane.add(btnLogin);

		JButton helpButton = new JButton("Help");
		helpButton.setBounds(152, 112, 89, 23);
		contentPane.add(helpButton);
		helpButton.setContentAreaFilled(false);
		helpButton.setFocusPainted(true); 

		JButton forgotpasswordButton = new JButton("Forgot Password?");
		forgotpasswordButton.setBounds(152, 146, 146, 23);
		contentPane.add(forgotpasswordButton);
		forgotpasswordButton.setContentAreaFilled(false);
		forgotpasswordButton.setFocusPainted(true);
		
		setVisible(true); 
	}
}
