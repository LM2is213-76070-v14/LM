package Logic;

public class Message {

	private String mName;
	private String mText;
	private String mDate;
	
	public Message(String name, String text, String date) {
		mName = name;
		mText = text;
		mDate = date;
	}
	
	public void setName(String name) {
		mName = name;
	}
	
	public String getName() {
		return mName;
	}
	
	public void setText(String text) {
		mText = text;
	}
	
	public String getText() {
		return mText;
	} 
	
	public void setDate(String date) {
		mDate = date;
	}
	
	public String getDate() {
		return mDate;
	}
}
