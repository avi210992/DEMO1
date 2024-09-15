package package3;

public class ThreadLocalExample extends Thread{
	static	A obj1;
	static String str;
	ThreadLocal<A> tlobj = new ThreadLocal<A>();

	public void run() {
		
		tlobj.set(obj1);
		int i;
		for (i = 0; i < 5; i++) {
		System.out.println("Current thread running is \t" + Thread.currentThread().getName() + " and value of i is " + i );
		tlobj.get().str1 = Thread.currentThread().getName();
		obj1.func("Hi this is "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
	
		
		ThreadLocalExample al1 = new ThreadLocalExample();
		
obj1 = new A();
		
		Thread th1 = new Thread(al1);
		Thread th2 = new Thread(al1);
		Thread th3 = new Thread(al1);

		th1.start();
		th2.start();
		th3.start();
	}

}

class A{
	
	String str1 = null;
	void func(String st1)
		{
		System.out.println("called by \t" + Thread.currentThread().getName() + " and the string value is "+ st1 + " and field string is " + str1);
	}
}
