package multithreading;

public class Sleep extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

