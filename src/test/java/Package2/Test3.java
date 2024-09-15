package Package2;

public class Test3 {

	
	public static void main(String[] args) {

		Run R1 = new Run("Thread1", 10);
		Thread th1 = new Thread(R1);

		Run R2 = new Run("Thread2", 10);
		Thread th2 = new Thread(R2);

		th1.start();
		th2.start();

	}
}

class Run implements Runnable {
	Dummy d1 = new Dummy();
	String name;
	int x = 10;

	Run(String name, int i) {
		this.name = name;
		this.x = i;

	}

	public void run() {

		for (int i = 0; i < 5; i++) {
			d1.change(name);
			System.out.println("Currently executing thread is" + Thread.currentThread().getName()
					+ "function output is " + d1.name);
			d1.change1(x);
			System.out.println(
					"Currently executing thread is" + Thread.currentThread().getName() + "function output is " + d1.x);
		}

	}
}

class Dummy {
	String name = "avinash";

	int x;

	void change(String name) {
		this.name = name;
	}

	void change1(int x) {
		this.x = x;
	}
}