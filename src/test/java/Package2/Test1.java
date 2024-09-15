package Package2;
import Package1.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Test1 {
	
	
	public static void main(String[] args) throws IOException {
		
File f1 = new File("C:\\Users\\SONY\\eclipse-workspace\\Demo1\\src\\test\\java\\Package1\\SampleText.txt");
	try (FileInputStream fs = new FileInputStream(f1)) {
		int i =0;
		
		while ( (i ) != -1)
		{
		i =  fs.read();
			System.out.print(String.valueOf((char)i));
			
		}
	}
	}}