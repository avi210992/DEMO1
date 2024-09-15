package Package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {

	public static void main(String[] args) {
		String s1 = "xfoo ffxxf00f" ;
		
		Pattern p = Pattern.compile("(.foo+?)(.*?)");
	//	System.out.println(p.matches("[of]?", s1));
		Matcher m = p.matcher(s1);
		System.out.println(m.groupCount()); 
		while(m.find())
		{
		
			String str = m.group(0);
			String str1 = m.group(1);
			System.out.println("text matches found  :  " + m.group(1) + " and " +  m.group(2));
			//System.out.println("text found begins at :"+m.start()  + " and ends at : "+ (m.end()));
		}
	}
}
