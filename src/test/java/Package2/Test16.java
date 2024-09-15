package Package2;

public class Test16 extends sample {
	void m2()
	{
		System.out.println("instance  override allowed child m2");
	}
	

	public static void main(String[] args) {
		
		Test16 t1 = new Test16();
		System.out.println(t1.x);;
		t1.m3();
		t1.m2();
		
		float f = 10;
	}

}

class sample
{
	
	int x =10;
	static int y;
	void m1()
	{
		System.out.println("instance parent m1");
	}
	void m2()
	{
		System.out.println("instance  override allowed parent m2");
	}
	
	static void m3()
	{
		System.out.println("static parent m2");
	}
}