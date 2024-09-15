package Package2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test10 {
public static void main(String[] args) {
	
	BufferedInputStream bis = null;
try {
	 bis = new BufferedInputStream(new FileInputStream("C:\\Users\\SONY\\eclipse-workspace\\Demo1\\src\\test\\java\\Package1\\Demo1\\SampleText"));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

StringBuffer sb1 = new StringBuffer();
int i ;
	try {
		while ((i = bis.read()) != -1)
		{
			char ch = (char)i;
			sb1.append(String.valueOf(ch));
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(sb1);
	
}
}

		