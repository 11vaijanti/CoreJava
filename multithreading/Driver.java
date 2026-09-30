package multithreading;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread t1 = new MyThread();
		t1.start();
		Sleep s = new Sleep();
		s.start();
		System.out.println("Main end");

	}

}
