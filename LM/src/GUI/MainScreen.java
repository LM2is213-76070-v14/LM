package GUI;

import javax.swing.*;

/**
 * The class MainScreen is the main GUI frame that is used in the application.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class MainScreen extends JFrame {

	/**
	 * Instantiates a new main screen.
	 * 
	 */
	public MainScreen() {
		createMainScreen();
	}

	/**
	 * Creates the main screen.
	 * 
	 */
	public void createMainScreen() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		setTitle("Tabbed Pane");  
		setSize(600,400);

		JTabbedPane tabPanel = new JTabbedPane();
		tabPanel.setTabPlacement(MAXIMIZED_HORIZ);
		getContentPane().add(tabPanel);

		JPanel updateTab = new JPanel();
		JPanel generalTab = new JPanel();
		JPanel disruptionsTab = new JPanel();
		JPanel createMessageTab = new JPanel();
		JPanel editMessageTab = new JPanel();
		JPanel editSubscriptionTab = new JPanel();
		JPanel mySubscriptionTab = new JPanel();
		JPanel myAccountTab = new JPanel();

		JLabel updateLabel = new JLabel();
		updateTab.add(updateLabel);
		ShowMessages showMessages = new ShowMessages(updateTab, menuBar);
		updateTab.add(showMessages.getPanel());

		JLabel createMessageLabel = new JLabel();
		createMessageTab.add(createMessageLabel);
		CreateMessage createMessage = new CreateMessage(createMessageTab);
		createMessageTab.add(createMessage.getPanel());

		JLabel mySubscriptionLabel = new JLabel();
		mySubscriptionTab.add(mySubscriptionLabel);
		MySubscriptions mySubscriptions = new MySubscriptions(mySubscriptionTab);
		mySubscriptionTab.add(mySubscriptions.getPanel());

		createMessageTab.setVisible(true);

		tabPanel.addTab("Updates", updateTab);
		tabPanel.addTab("General info", generalTab);
		tabPanel.addTab("Disruptions", disruptionsTab);
		tabPanel.addTab("Create message", createMessageTab);


		tabPanel.addTab("Edit message", editMessageTab);
		tabPanel.addTab("Edit subscription", editSubscriptionTab);
		tabPanel.addTab("My subscriptions", mySubscriptionTab);
		tabPanel.addTab("My account", myAccountTab);

		setVisible(true);
	}
}