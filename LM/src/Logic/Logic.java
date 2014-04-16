package Logic;

public class Logic {
	
	private MessageList mMessageList;
	
	public Logic() {
		
	}
	
	public Message getMessage(int index) {
		
		Message message = mMessageList.getMessages(index);
		return message; 
	}
	
	public int getLenght() {
		int lenght = mMessageList.getListLenght();
		return lenght;
	}
	
	public void addMessage(Message message) {
		mMessageList.addMessage(message);
	}
	
}
