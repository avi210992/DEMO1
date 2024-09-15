package Package2;

public class Test18 extends A {

	int x = 10;
	int a = 24;

	static void m2() {
		System.out.println("child static");
	}

	Test18() {
		y = x;
		System.out.println(y);
		System.out.println(x);
		y = 20;
		System.out.println(y);
		System.out.println(x);
	}
//		void m1()
//		{
//			x= 10; y = 20; z=30;
//			System.out.println("child Test18 m1 printing xyx value   "  +x + y+ z);
//			
//		}

	void m3() {

	}

	public static void main(String[] args) {

		A th1 = new Test18();

		A obj1 = new A();

		Test18 t1 = new Test18();
		//Test18 t2 = ((Test18) obj1);
		
		//((Test18)obj1).m3();
	
	
		

	


		System.out.println(th1.hashCode());

	}
}

class A {

	int x = 10, y = 2, z = 1;

	static void m2() {
		System.out.println("parent static");
	}

	void m1() {
		System.out.println("Parent m1");
	}

	void m4() {
		System.out.println("Parent m4");
	}
}

class B extends A {
	void m1() {
		System.out.println("child B m1 printing xyx value   " + x + y + z);
	}
}

class C extends A {
	void m1() {
		System.out.println("child C m1 printing xyx value   " + x + y + z);
	}
}
