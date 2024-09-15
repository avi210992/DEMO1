package package3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

public class FileTest {

	
	
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("file.separator"));
		
		File f1 = new File("C:\\Automation/FileAutom/");
		
		
File[] f3 =	f1.listFiles();

System.out.println(Arrays.toString(f3));	
System.out.println(f3[1].isDirectory());
		
		String path = "C:\\Automation\\";
		String dir = "FileAutom";
		File f2 = new File(path,dir);
		File files[] = f2.listFiles();
		System.out.println(f2.exists());
		System.out.println(Arrays.toString(files));	
		
		
		File f4 = new File("C:\\Automation\\FileAutom\\test3.txt");
		if(!f4.exists())
		{
			f4.createNewFile();
		}
		File f5 = new File("C:\\Automation\\FileAutom\\test2.txt");
		
		if(f4.equals(f5))
		{
			System.out.println("Equal only");
			
		}
		else
		{
			System.out.println("Fail");
		}
	
		File f7 = new File("C:\\Automation\\"+File.separator+"FileAutom" + File.separator+"test5.txt");
		if(!f7.exists())
		{
			f7.createNewFile();
		}

		FileUtils.copyFile(f5, f7);
	
	}
}
