package methodchaining;

public class Testdriver {

	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.m1().m2().m3().m4();

	}

}
