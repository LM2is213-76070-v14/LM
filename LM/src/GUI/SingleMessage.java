package GUI;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class SingleMessage extends JFrame {
	
	private JPanel contentPane;
	private JTextArea txtpnViktigt;
	private JScrollPane scrollPane;

	/**
	 * Create the frame.
	 */
	public SingleMessage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnViktigt = new JTextArea();
		txtpnViktigt.setLineWrap(true);
		txtpnViktigt.setWrapStyleWord(true);
		scrollPane = new JScrollPane(txtpnViktigt);
		contentPane.add(scrollPane);  
		scrollPane.setBounds(28, 10, 377, 191);  
		scrollPane.setVisible(true);
		
//		txtpnViktigt = new JTextArea();
//		txtpnViktigt.setLineWrap(true);
//		txtpnViktigt.setWrapStyleWord(true);
//		scrollPane = new JScrollPane(txtpnViktigt);
//		//JScrollPane scrollPanePlain = new JScrollPane(txtpnViktigt);  
//		contentPane.add(scrollPanePlain);  
//		scrollPanePlain.setBounds(28, 10, 377, 191);  
//		scrollPanePlain.setVisible(true);
		
		txtpnViktigt.setText("VIKTIGT!!! \n"
				+ "På söndag kommer systemet vara nere för utvärdering och uppgradering. Vi hoppas allt ska vara körbart på Måndag morgon igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen och annar blir det kanelbullar varje dag tills.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igenoch annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen och annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen och annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igenoch annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen. \n \n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen. \n \n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igenoch annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n \n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen och annar blir det kanelbullar varje dag tills.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen och annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och ZZZZZ i systemet igen.\n"
				+ "Det är exjobbarana som ska in och YYYYY i systemet igen och annar blir det kanelbullar varje dag tills\n"
				+ "Det är exjobbarana som ska in och XXXX i systemet igen. \n \n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "SISTA RADEN");
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(60, 215, 89, 23);
		contentPane.add(btnPrevious);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(170, 215, 89, 23);
		contentPane.add(btnClose);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(280, 215, 89, 23);
		contentPane.add(btnNext);
	
	}
	
}

