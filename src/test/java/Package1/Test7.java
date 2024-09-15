package Package1;

public class Test7 implements I1,I2  {
	


	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I1.super.m2();
		I2.super.m2();
	}

	public void m2() {
		// TODO Auto-generated method stub
		
	}
	Test7()
{
	
}
	public static void main(String[] args) {
		
	Test7 t1 =new Test7();
	t1.m1();


		
	
	}

	
}

interface I1
{
	void m1();
	default void m2()
	{
		System.out.println("I1 default");
	}
	
	static void m3()
	{
		System.out.println("I1 staticc");
	}
}

interface I2 
{
	void m1();
default void m2()
	{
		System.out.println("I2 default");
	}
	
	static void m3()
	{
		System.out.println("I2 staticc");
	}
}