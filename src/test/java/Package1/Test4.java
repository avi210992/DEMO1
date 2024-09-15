package Package1;

import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
	
	Test4(String name)
	{
		System.out.println(name);
	}
	void func()
	{
		System.out.println("parent class func");
	}
	
	interface Inter1
	{
		void exec();
		
	}
	
	void exec()
	{
		System.out.println("implementation of class test4");
	}
	public static void main(String[] args) {
		
	
		Test4 t1 = new Test4("Avinash")
				{
			
			void func()
			{
				System.out.println("anon class func");
			}
			
				};
				
				t1.func();
				t1.exec();
				
				A obj1 = new A();
				obj1.exec();
				
				ArrayList<Integer> al = new ArrayList<Integer> ();

				Collections.sort(al);
		
	}

}


class A implements Test4.Inter1
{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("implementation of nested interface");
	}
	
}
