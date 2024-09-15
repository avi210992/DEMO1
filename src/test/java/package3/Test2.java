package package3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class Test2 {
	public static void main(String[] args) {

		
		String[] arr1 = { "Delhi", "Gujarat", "Chennai", "Mylapore","Triplicane", "Gujarat", "Avadi", "Udumalai", "Ziltch" , "Gurgeon" , "Gujarat"};
		
	
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		for (int i =0; i< arr1.length;i++)
		{
			ht.put(i, arr1[i]);
			System.out.println(ht.get(i).hashCode());
		}
		HashMap<Integer,String> ht1 = new HashMap<>(ht);
		
	
		System.out.println(ht1);
		
		System.out.println(ht1.put(11, "Gujarat"));
//		System.out.println(ht.get(5));
//		System.out.println(ht.compute(5, (k,v) -> k+v));
		
		
		ht1.clear();
		
	}
	

}
