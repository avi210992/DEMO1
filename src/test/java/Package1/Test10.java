package Package1;

public class Test10 {
	static Test10.Inner ref1;
	private int x = 10;
	static void m1() {
		System.out.println("Outer static m1");
	}

	void m2() {
		System.out.println("Outer instance m2");

	}
	
	 class Inner {
		 void m3() {
			System.out.println("inner  instance m1");
			m2();
			m1();
			System.out.println(x);
		}

		void m4() {
			System.out.println("inner instance m2");

		}
	}

	
	public static void main(String[] args) {
		
		ref1 = new Test10().new Inner();
		Test10 ref2 =new Test10();
		Test10 ref3 =new Test10();
		Test7 t1= new Test7();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
