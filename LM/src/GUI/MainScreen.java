package GUI;

import javax.swing.*;

import java.awt.event.*;

public class MainScreen extends JFrame {

	public MainScreen() {
		createMainScreen();
	}

	public void createMainScreen() {

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		//This will create the title you see in the upper left of the window    
		setTitle("Tabbed Pane");  
		setSize(600,400); //set size so the user can "see" it
		//Here we are creating the object

		JTabbedPane tabPanel = new JTabbedPane();

		//Moves tabs to the right side
		tabPanel.setTabPlacement(MAXIMIZED_HORIZ);

		//This creates the template on the windowed application that we will be using
		getContentPane().add(tabPanel);

		JPanel updateTab = new JPanel();//This will create the first tab

		JPanel generalTab = new JPanel();//This will create the second tab

		JPanel disruptionsTab = new JPanel();//This will create the third tab

		JPanel createMessageTab = new JPanel();//This will create the fourth tab

		JPanel editMessageTab = new JPanel();//This will create the fifth tab

		JPanel editSubscriptionTab = new JPanel();//This will create the sixth tab

		JPanel mySubscriptionTab = new JPanel();//This will create the seventh tab

		JPanel myAccountTab = new JPanel();//This will create the eight tab

		//This creates a non-editable label, sets what the label will read
		//and adds the label to the first tab
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

		//This adds the first and second tab to our tabbed pane object and names it
		tabPanel.addTab("Updates", updateTab);
		tabPanel.addTab("General info", generalTab);
		tabPanel.addTab("Disruptions", disruptionsTab);
		tabPanel.addTab("Create message", createMessageTab);


		tabPanel.addTab("Edit message", editMessageTab);
		tabPanel.addTab("Edit subscription", editSubscriptionTab);
		tabPanel.addTab("My subscriptions", mySubscriptionTab);
		tabPanel.addTab("My account", myAccountTab);

		setVisible(true); //otherwise you won't "see" it 
	}
}