package multithreading;

public class IllegalThreadsStateEception {
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.start();
		t1.start();
	}
}
