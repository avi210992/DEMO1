package Package1;

public class Enumexample {
	enum data
	{
		
		sample1("A"), sample2("B"), sample3("C") , sample4("C");
		
		
		private String s;
data(String string) {
			// TODO Auto-generated constructor stub
			
		this.s = string;
			
		}
		
String m1()
{
	return s;
}
	}	
	
	public static void main(String[] args) {
		
		if (data.valueOf("sample1").equals(data.sample1))
		{
			System.out.println(data.sample1.m1());
		}
		
	
	}
}
