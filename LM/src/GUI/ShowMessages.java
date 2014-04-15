package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
	public ShowMessages(JPanel mainPanel) {
		mMessageList = new MessageList();
		createPanel(mainPanel);
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
						// Här skriver man metoden för vilket case som skall
						// hämtas
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

	/**
	 * This method simply returns the whole class as a Panel
	 */
	public JPanel getPanel() {
		return contentPane;
	}

}