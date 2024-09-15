package Package2;

public class Test20 extends A11{

	
	public static void main(String[] args) {
		
		Test20 t1 = new Test20();
		
		A11 a = new Test20();
		System.out.println(t1 instanceof A11);
		
		System.out.println(t1 instanceof Test20);
		System.out.println(a instanceof Test20);
		
	}
}

class A11
{
	
}

class B11 extends A11
{
	
}