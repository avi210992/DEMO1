package package3;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

public class ImptFileUtils {
	
	public static void main(String[] args) throws IOException {
			
	File f = new File ("C:\\Automation\\FileAutom\\sub1");
	File f2 = new File("C:\\Automation\\FileAutom\\sub3");
	

	File[] list1 = f.listFiles();
	String[] list2= f.list();
	System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	

FileUtils.copyDirectory(f,f2, FileFilterUtils.nameFileFilter("test1.txt"));

File f3 = new File("C:\\Automation\\FileAutom\\sub3\\test1.txt");
System.out.println(FileUtils.readFileToString(f3));;
	
	
	
	
	
	}

}
