package Package4;

public class ThreadLocalTest implements Runnable {
	
	
	
	public static void main(String[] args) {
		ThreadLocal thL1 = new ThreadLocal();
		
		ThreadLocalTest tl1 = new ThreadLocalTest();
		
		Thread th1 = new Thread(()->{}, "");
		Thread th2 = new Thread(tl1);
		Thread th3 = new Thread(tl1);
		Thread th4 = new Thread(tl1);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
