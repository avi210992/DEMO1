package Package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test7 {

	public static void main(String[] args) {

		String s1 = "fooffxxfoof";

		Pattern p = Pattern.compile(".f*?");
		Matcher m = p.matcher(s1);
		System.out.println(m.groupCount());
		while (m.find()) {
			
			System.out.println("text matches found  :  " + m.group());
		}

	}

}
