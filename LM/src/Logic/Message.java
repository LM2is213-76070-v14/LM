package Logic;

/**
 * The Message class creates a message that can be edited.
 * 
 * @author Lisa Broman, Patrik Karlsson and Jonathan Kiiskinen
 * @version 2014-04-16
 */
public class Message {

	private String mName;
	private String mText;
	private String mDate;
	
	/**
	 * Instantiates a new message with a name, a text and a date.
	 *
	 * @param name - the name
	 * @param text - the text
	 * @param date - the date
	 */
	public Message(String name, String text, String date) {
		mName = name;
		mText = text;
		mDate = date;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name - the name
	 */
	public void setName(String name) {
		mName = name;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return - the name
	 */
	public String getName() {
		return mName;
	}
	
	/**
	 * Sets the text.
	 *
	 * @param text - the text
	 */
	public void setText(String text) {
		mText = text;
	}
	
	/**
	 * Gets the text.
	 *
	 * @return - the text
	 */
	public String getText() {
		return mText;
	} 
	
	/**
	 * Sets the date.
	 *
	 * @param date - the date
	 */
	public void setDate(String date) {
		mDate = date;
	}
	
	/**
	 * Gets the date.
	 *
	 * @return - the date
	 */
	public String getDate() {
		return mDate;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return mDate + " | " + mName + " | " + mText;
	}
}
