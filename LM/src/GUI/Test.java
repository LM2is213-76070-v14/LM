package GUI;

import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Test extends JFrame {


	private JPanel contentPane;
	private TextArea txtpnViktigt;

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtpnViktigt = new TextArea();
		txtpnViktigt.setText("VIKTIGT!!! \n"
				+ "På söndag kommer systemet vara nere för utvärdering och uppgradering. Vi hoppas allt ska vara körbart på Måndag morgon igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.\n"
				+ "Det är exjobbarana som ska in och arbetat i systemet igen.");
		txtpnViktigt.setBounds(28, 10, 377, 191);
		contentPane.add(txtpnViktigt);
		
	
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(170, 215, 89, 23);
		contentPane.add(btnReturn);
		
	
	}

}
