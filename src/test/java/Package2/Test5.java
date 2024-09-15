package Package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
	
	public static void main(String[] args) {
		
		String s1 = "gekseek for geeks ieess a tut forrr geeeks" ;
		
		Pattern p = Pattern.compile("e*?");
		Matcher m = p.matcher(s1);
		
		while(m.find())
		{
			String str = m.group();
			System.out.println("text matches found  :  " +str);
			System.out.println("text found begins at :"+m.start()  + " and ends at : "+ (m.end()-1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
