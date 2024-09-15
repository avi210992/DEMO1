package Package1;

public class Test3 {

	public static void main(String[] args) {

		Thread th1 = new Thread() {
			public void run() {
				System.out.println("Currently Executing " + this.getName() + " and state is " + this.getState());
				System.out.println(this.isInterrupted());
			}
		};
		th1.setPriority(1);
		th1.start();

		Thread th2 = new Thread() {
			public void run() {
				System.out.println("Currently Executing " + this.getName() + " and state is " + this.getState());
				System.out.println(Thread.interrupted());
			}
		};
		th2.setPriority(10);
		th2.start();
		
		

	}
}