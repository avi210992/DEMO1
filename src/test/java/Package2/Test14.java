package Package2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test14 <T,R> {

	

		 
	
	
	public static void main(String[] args) {
		
		Double i1  = 10.0;
		
	
String s2 =	i1.toString();
System.out.println(s2);
	Function<? super Number, ? extends String> f1 = s -> String.valueOf(s);
	System.out.println(f1.apply(10.0));
		
	}
	
	
	
}
