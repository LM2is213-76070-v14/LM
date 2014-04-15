package Logic;

import java.util.ArrayList;

public class MessageList {
	
	private ArrayList<Message> mMessageList;
	
	public MessageList() {
		mMessageList = new ArrayList<Message>();
		fillList();
	}
	
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
	
	public Message getMessages(int counter) {
		Message message = mMessageList.get(counter);
		return message;
	}
	
	public int getListLenght() {
		int lenght = mMessageList.size();
		return lenght;
	}
	
}
