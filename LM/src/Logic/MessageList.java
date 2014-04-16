package Logic;

import java.util.ArrayList;

/**
 * MessageList. A list that holds items of the class Message.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class MessageList {
	
	private ArrayList<Message> mMessageList;
	
	//EDIT remove fillList-method
	//DELETE --> //remove this line
	/**
	 * Instantiates a new message list.
	 * And fills it with some messages. //remove this line
	 */
	public MessageList() {
		mMessageList = new ArrayList<Message>();
		fillList();
	}
	
	//DELETE this method 
	/**
	 * Fills the list with some messages.
	 * 
	 */
	public void fillList() {
		
		Message m1 = new Message("Driftstopp", "Det har tyvärr skett en olycka...", "2014-04-14");
		Message m2 = new Message("Information", "Uppdatering i GeoVy skedde under helgen...", "2014-04-14");
		Message m3 = new Message("Generellt", "Idag är det Sveriges nationaldag...", "2014-04-14");
		Message m4 = new Message("Driftstopp", "En av våra servrar har tyvärr börjat brinna...", "2014-04-14");
		
		mMessageList.add(m1);
		mMessageList.add(m2);
		mMessageList.add(m3);
		mMessageList.add(m4);
		
	}
	
	/**
	 * Gets the messages.
	 *
	 * @param counter the counter
	 * @return the messages
	 */
	public Message getMessages(int counter) {
		Message message = mMessageList.get(counter);
		return message;
	}
	
	/**
	 * Gets the length of the list.
	 *
	 * @return - the list length 
	 */
	public int getListLength() {
		int length = mMessageList.size();
		return length;
	}
	
	/**
	 * Adds a message to the list.
	 *
	 * @param message - the message
	 */
	public void addMessage(Message message) {
		mMessageList.add(message);
	}
	
}
