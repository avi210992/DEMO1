package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test9 {
	int x = 10;
	static String st1 = " hello";
	void m2 ()
	{
		
	}
	
	Integer m1(String s1)
	{
		return Integer.parseInt(s1);
	}
	
	
	
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		String arr[] = new String[]{"10","21","101"};
		Test9 t1 = new Test9();
		System.out.println((String) Class.forName("package3.Test9").getDeclaredField("st1").get(new Test9()));;
		
		System.out.println(String.class);

		List<String> al1 = new ArrayList<String>(Arrays.asList(arr));
		
		Function<String,Integer> f1 =(t)-> {	
				System.out.println();
				  return new Test9().m1(t);
				  }; 
		
		for(String temp : al1)
		{
			System.out.println(f1.apply(temp));
		}
		//System.out.println(f1.apply("10"));
	
		
	}
}
