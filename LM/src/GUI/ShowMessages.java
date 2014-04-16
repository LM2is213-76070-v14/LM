package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import Logic.Message;
import Logic.MessageList;


public class ShowMessages {

	private JPanel contentPane;
	private MessageList mMessageList;

	/**
	 * This is the constructor
	 */
	public ShowMessages(JPanel mainPanel, JMenuBar menuBar) {
		mMessageList = new MessageList();
		createPanel(mainPanel);
		createMenuBar(menuBar);
	}

	/**
	 * This Method creates the view of all messages
	 */
	public void createPanel(JPanel mainPanel) {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.add(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);

		JList list;
		DefaultListModel model;

		model = new DefaultListModel();
		list = new JList(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane pane = new JScrollPane(list);

		MouseListener mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseEvent) {
				JList MessageList = (JList) mouseEvent.getSource();
				if (mouseEvent.getClickCount() == 2) {
					int index = MessageList.locationToIndex(mouseEvent.getPoint());
					if (index >= 0) {
						Object o = MessageList.getModel().getElementAt(index);
						System.out.println("Double-clicked on: " + o.toString());
						
						
						SingleMessage tab = new SingleMessage();
					    tab.setVisible(true);
					}
				}
			}
		};
		list.addMouseListener(mouseListener);

		int lenght = mMessageList.getListLenght();

		for(int i=0; i<lenght; i++) {
			Message message = mMessageList.getMessages(i);
			model.addElement(message.toString());
		}

		contentPane.add(pane);
	}
	
	public void createMenuBar(JMenuBar menuBar) {
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem itemNew = new JMenuItem("New");
		menuFile.add(itemNew);
		
		JMenuItem itemOpen = new JMenuItem("Open");
		menuFile.add(itemOpen);
		
		JMenuItem itemSave = new JMenuItem("Save");
		menuFile.add(itemSave);
		
		JMenuItem itemPrint = new JMenuItem("Print");
		menuFile.add(itemPrint);
		
		JMenuItem itemExit = new JMenuItem("Exit");
		menuFile.add(itemExit);
		
		JMenu menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		JMenuItem itemDelete = new JMenuItem("Delete");
		menuEdit.add(itemDelete);
		
		JMenuItem itemArchive = new JMenuItem("Archive");
		menuEdit.add(itemArchive);
		
		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);
		
		JMenuItem itemHelp = new JMenuItem("Help");
		menuHelp.add(itemHelp);
		
		JMenuItem itemAbout = new JMenuItem("About");
		menuHelp.add(itemAbout);
	}

	/**
	 * This method simply returns the whole class as a Panel
	 */
	public JPanel getPanel() {
		return contentPane;
	}

}