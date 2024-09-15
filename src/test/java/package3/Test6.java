package package3;

import org.apache.commons.io.input.ThrottledInputStream;

public class Test6  {
	test20 t1;
	String id;
	int num;
	public Test6() {

	}
 test20 m2(test20 t1)
{
	return this.t1 = t1;
}
	public static void main(String[] args) {
	Test6 t6 = new Test6();	

	t6.m2(new  test20());
	t6.t1.func();
		
	}

}

 class test20
{
	
	void func()
	{
		System.out.println(" test20 func");
	}
	
	static void func1()
	{
		System.out.println(" test20 func");
	}
	
}