package package3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

public class File2 {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f1 = new File("C:\\Automation\\FileAutom\\");
		try {
			FileUtils.copyFile( new File("C:\\Automation/FileAutom/test2.txt"), new File("C:\\Automation/FileAutom/sub1/testcopy.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Automation/FileAutom/test3.txt"));
		
		String s1 ="";
		
		try {
			while((s1=br1.readLine()) != null)
			{
				System.out.println(s1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
