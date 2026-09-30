package multithreading;

public class PriorityOfThread {

	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		et.setPriority(10);  //will print even no first as 10 is highest priority
		et.start();
		ot.start();

	}

}
