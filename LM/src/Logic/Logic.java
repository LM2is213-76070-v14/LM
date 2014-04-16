package Logic;

public final class Logic {
	
	private static MessageList mMessageList;
	
	public Logic() {
		mMessageList = new MessageList();
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
