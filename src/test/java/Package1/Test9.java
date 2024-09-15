package Package1;

public class Test9 {
	
	
	
	public static void main(String[] args) {
		
		
		
		Thread t1 = new Thread () {@Override
			public void run() {
			
			
			for (int i =0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
			System.out.println("imp of first Thread method");
		}
		}


		};
		
		t1.start();
		
		
		
		Runnable r1 = () ->
				{
	
					for (int i =0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName());
						System.out.println("imp of first runnable interface");
					}
					
			
				};
Thread t3 = new Thread(() ->
{
	
	for (int i =0; i < 5; i++) {
	System.out.println(Thread.currentThread().getName());
		System.out.println("imp of first runnable interface");
	}
	

}, "Runnable based thread");
t3.start();



Thread t2 = new Thread () {@Override
	public void run() {
	
	
	for (int i =0; i < 5; i++) {

	System.out.println("imp of Damemon Thread method");
}
}


};
t2.setDaemon(true);
t2.start();

		
		
		
		
		
		
		
		
		
		
	}
	
	

}
