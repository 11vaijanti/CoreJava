package multithreading;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main start");
		MyThread t1 = new MyThread();
		t1.start();
		t1.join();
		System.out.println("Main end");

	}

}
