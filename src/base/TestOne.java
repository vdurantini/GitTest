package base;

public class TestOne {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("This is just a simple test");
		
		// Ciclo for per fare il countdown
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Go!");

	}

}
