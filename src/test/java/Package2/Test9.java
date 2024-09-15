package Package2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test9 {
	
	public static void main(String[] args) {
		
		int ch1 = 65;

StringBuffer sb1 = new StringBuffer(ch1);

sb1.append(65);
System.out.println(sb1);


String s1 = "the go%d i@s every(where) b%\"ut we #h@av# to believe it";

//s1 = s1.replaceAll("[^a-zA-z\\s]", "");

System.out.println(s1);
	
StringTokenizer st1 = new StringTokenizer(s1,"%!@$^&*()\"");

while(st1.hasMoreTokens())
{
	System.out.println(st1.nextToken());
	}	
		

s1 = s1.replaceAll("[^a-zA-Z0-9\\s]", "");
System.out.println(s1);

StringBuffer sb11 =new StringBuffer();

sb11.append("avinash");

System.out.println(sb11.insert(7, " is a engineer"));

sb11.setCharAt(7 ,'*');
System.out.println();
	}
	

	
	
}
