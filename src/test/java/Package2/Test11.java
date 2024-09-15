package Package2;

public class Test11 {

	void m1(String s1) {
		System.out.println("Entered text  " + s1);

	}
	
	void m3(I1 ref1)
	{
		ref1.m2("Special");
	}

	public static void main(String[] args) {

		Test11 t1 = new Test11();
		I1 ref1 = t1::m1;
		ref1.m2("King");
t1.m3(ref1);
		I1 ref2 = (s) -> System.out.println(s);
		ref2.m2("King1");
		
		I1 ref3 = s -> t1.m1(s);
		
		ref3.m2("King2");

		I1 ref4 = new I1() {

			@Override
			public void m2(String x) {
				// TODO Auto-generated method stub

			}

		};
		ref4.m2("King4");

	}

}

interface I1 {
	void m2(String x);

}