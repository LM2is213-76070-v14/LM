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
 * The class SingleMessage is the GUI class that shows a message.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class SingleMessage extends JFrame {
	
	private JPanel contentPane;
	private JTextArea messageText;
	private JScrollPane scrollPane;

 /**
 * Creates the frame.
 *
 * @param text - the message text
 */
	public SingleMessage(String text) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(60, 215, 89, 23);
		contentPane.add(btnPrevious);
		
		JButton btnClose = new JButton("Close");
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnClose.setBounds(170, 215, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(280, 215, 89, 23);
		contentPane.add(btnNext);
	
	}
	
    //DELETE //this method is used as a help method to run the class.
    public static void main (String []args){
       SingleMessage tab = new SingleMessage(null);
       tab.setVisible(true);
       
   }
	
}

