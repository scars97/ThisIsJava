package threadEx.thread06.thread06_05;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		printThread1.setStop(true);
	}
}
