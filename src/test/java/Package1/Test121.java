package Package1;

public class Test121 extends  B11 {
	
	
	void m2(){
	super.m1();
	}
	
	
	public static void main(String[] args) {
		Test121 t1 = new Test121();
		t1.m2();
	}

}

class A11
{
	 void m1()
	{
		 
		System.out.println("a11 m1");
	}
}

class B11 extends A11
{
	 void m1()
	{
		 super.m1();
		System.out.println("b11 m1");
	}
}
