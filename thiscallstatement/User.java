package thiscallstatement;
//this() is used to call same class constructor
//should be first statement in constructor block
//can use only once
public class User {

	String UID;
	int password;
	String email;
	String bio;
	
	public User(String UID, int password, String email, String bio ) {
		this(UID,password,email);
		this.bio = bio;
	}
	public User(String UID, int password, String email ) {
		this(UID,password);		
		this.email = email;
		
	}
	public User(String UID, int password ) {
		this.UID = UID;
		this.password = password;
		
	}

}
