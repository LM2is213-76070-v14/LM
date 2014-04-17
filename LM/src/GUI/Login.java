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
	private JTextField userNameField;
	private JTextField passwordField;

	/**
	 * Instantiates a new login.
	 * 
	 */
	public Login() {
		createPanel();
	}

	public void createPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		userNameField = new JTextField();
		userNameField.setBounds(167, 50, 131, 20);
		contentPane.add(userNameField);
		userNameField.setColumns(10);

		passwordField = new JTextField();
		passwordField.setBounds(167, 81, 131, 20);
		contentPane.add(passwordField);
		passwordField.setColumns(10);

		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(82, 53, 65, 14);
		contentPane.add(userNameLabel);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(82, 84, 65, 14);
		contentPane.add(passwordLabel);

		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen mainScreen = new MainScreen();
				setVisible(false);
				dispose();
			}
		});
		LoginButton.setBounds(313, 215, 89, 23);
		contentPane.add(LoginButton);

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
