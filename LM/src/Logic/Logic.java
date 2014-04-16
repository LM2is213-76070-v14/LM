package Logic;

/**
 * The Class Logic is used to connect the logic and the GUI of the application.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public final class Logic {

	private static MessageList mMessageList;

	/**
	 * Instantiates a new logic with a list.
	 * 
	 */
	public Logic() {
		mMessageList = new MessageList();
	}

	/**
	 * Gets a message.
	 *
	 * @param index - the index
	 * @return - the message
	 */
	public Message getMessage(int index) {

		Message message = mMessageList.getMessages(index);
		return message; 
	}

	/**
	 * Gets the length of the message list.
	 *
	 * @return - the length
	 */
	public int getLength() {
		int lenght = mMessageList.getListLength();
		return lenght;
	}

	/**
	 * Adds a message to the list.
	 *
	 * @param message - the message
	 */
	public void addMessage(Message message) {
		mMessageList.addMessage(message);
	}
}
