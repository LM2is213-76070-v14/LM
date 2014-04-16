package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 * The class SingleMessage is a GUI class that shows a message.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class SingleMessage extends JFrame {

	private JPanel contentPane;
	private JTextArea messageText;
	private JScrollPane scrollPane;

	/**
	 * This is the constructor for SingleMessage
	 *
	 * @param text - the message text
	 */
	public SingleMessage(String text) {
		create(text);
	}


	/**
	 * Creates the frame.
	 *
	 * @param text - the message text
	 */
	public void create(String text) {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		messageText = new JTextArea();
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		scrollPane = new JScrollPane(messageText);
		contentPane.add(scrollPane);  
		scrollPane.setBounds(28, 10, 377, 191);  
		scrollPane.setVisible(true);

		messageText.setText(text);

		JButton buttonPrevious = new JButton("Previous");
		buttonPrevious.setBounds(60, 215, 89, 23);
		contentPane.add(buttonPrevious);

		JButton buttonClose = new JButton("Close");

		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		buttonClose.setBounds(170, 215, 89, 23);
		contentPane.add(buttonClose);

		JButton buttonNext = new JButton("Next");
		buttonNext.setBounds(280, 215, 89, 23);
		contentPane.add(buttonNext);
	}
}

