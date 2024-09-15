package Package1;

public class Test1 {
	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		
	// Thead 2	
		Thread t2 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

// THread3		
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println((Thread.currentThread().getName()) + "*****" + i);
				}

				System.out.println(Thread.currentThread().getName());

			}
		};

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getState());

		t3.start();
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(t3.getState());

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
