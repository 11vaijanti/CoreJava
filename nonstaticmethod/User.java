package nonstaticmethod;

public class User {
	String uid;
	String mail;
	int pwd;
	String bio;
	public User(String uid,String mail,int pwd,String bio) {
		this(uid,mail,pwd);
		this.bio = bio;
	}
	public User(String uid, String mail, int pwd) {
		this(uid,pwd);
		this.mail = mail;
	}
	public User(String uid,int pwd) {
		this.uid = uid;
		this.pwd = pwd;
	}
	public void printInfo() {
		System.out.println("UID : " + uid);
		System.out.println("Mail : " + mail);
		System.out.println("password : " + pwd);
		System.out.println("Bio : " + bio);
	}
}
