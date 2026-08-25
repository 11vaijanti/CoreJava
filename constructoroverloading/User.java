package constructoroverloading;

public class User {
	String UID;
	int password;
	String email;
	String bio;
	
	public User(String UID, int password, String email, String bio ) {
		this.UID = UID;
		this.password = password;
		this.email = email;
		this.bio = bio;
	}
	public User(String UID, int password, String email ) {
		this.UID = UID;
		this.password = password;
		this.email = email;
		
	}
	public User(String UID, int password ) {
		this.UID = UID;
		this.password = password;
		
	}
}
