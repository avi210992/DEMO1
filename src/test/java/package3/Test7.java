package package3;

public class Test7 {
	
	
	abs1 meth1()
	{
		abs1 obj = new abs1()
				{
		

			@Override
			void m2() {
				// TODO Auto-generated method stub
				
			}
				};
				return obj;
		
		
	}
	public static void main(String[] args) {
		
		Test7 t = new Test7();
		t.meth1().m1();
	
		
	}

}

abstract class abs1
{
	
	int x;
	abs1()
	{
		System.out.println("hi abs1");
	}
	void m1()
	{
		
	}
	
	abstract void m2();
	
}

class abs2 extends abs1
{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("h1");
		
	}
	
}