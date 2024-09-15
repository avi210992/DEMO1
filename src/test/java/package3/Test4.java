package package3;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		
String[] arr1 = { "Delhi", "Gujarat","Chennai", "Mylapore","Triplicane", "Gujarat", "Avadi", "Udumalai", "Ziltch" , "Gurgeon" , "Gujarat"};
		
		
	TreeSet<String> ht = new TreeSet<>();
		
		for (int i =0; i< arr1.length;i++)
		{
			ht.add(arr1[i]);
	
		}
		
		System.out.println(ht);
		

	}
	
	

}
