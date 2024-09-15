package package3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File3 {
public static void main(String[] args) throws IOException {
	File f1 = new File("C:\\Automation\\FileAutom\\sub1\\testcopy - Copy.txt");
	File f2 = new File ("C:\\Automation\\FileAutom\\sub2\\Subsub3\\testcopy - Copy.txt");
	//FileUtils.copyDirectoryToDirectory(f1, f2);
	
	FileUtils.copyFile(f1, f2);
	
	
}
	
	
}
