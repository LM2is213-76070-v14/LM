package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;


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
		createPanel(mainPanel);
	}

	public void createPanel(JPanel mainPanel) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(450,300));

		JRadioButton updateRadioButton = new JRadioButton("Updates");
		updateRadioButton.setBounds(71, 85, 109, 23);
		contentPane.add(updateRadioButton);

		JRadioButton generalRadioButton = new JRadioButton("General info");
		generalRadioButton.setBounds(71, 123, 109, 23);
		contentPane.add(generalRadioButton);

		JRadioButton disruptionsRadioButton = new JRadioButton("Disruptions");
		disruptionsRadioButton.setBounds(71, 166, 109, 23);
		contentPane.add(disruptionsRadioButton);

		JLabel subscriptionLabel = new JLabel("Choose your subscriptions:");
		subscriptionLabel.setBounds(71, 45, 204, 14);
		contentPane.add(subscriptionLabel);

		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		saveButton.setBounds(316, 217, 89, 23);
		contentPane.add(saveButton);
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
