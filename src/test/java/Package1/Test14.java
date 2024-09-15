package Package1;

public class Test14 {

	Test14()
	{
		System.out.println("Default parent");
	}
	
	Test14(String s1)
	{
		System.out.println("Default param parent " + s1);
	}
	
	
	public static void main(String[] args) {
		B obj1 = new B("Param constr");
		obj1.m1();
	}
}


class B extends Test14
{
	B(String s1)
	{
		//super(s1);
		
	}
	
	void m1 ()
	{
		System.out.println("child m1");
	}
}