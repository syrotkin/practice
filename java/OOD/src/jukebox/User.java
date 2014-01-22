package jukebox;

public class User {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private long ID;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}

	
	public User(String name, long iD) { 
	}

	// WTF? Really?
	//public User getUser() {
	//	return this;
	//}

	public static User addUser(String name, long iD) {
		return new User(name, iD);
	}
}