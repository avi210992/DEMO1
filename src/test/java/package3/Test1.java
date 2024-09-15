package package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
	ArrayList<String> al2;
	
	List<String> al1;
	List<String> m1()
	{
	
	{
		String[] arr1 = { "Delhi", "Gujarat", "Chennai", "Mylapore","Triplicane", "Gujarat", "Avadi", "Udumalai", "Ziltch" , "Gurgeon" , "Gujarat"};
		
		al1 = new ArrayList<String>();
	
	for (int i=0 ; i < arr1.length; i++)
	{
		al1.add(i,arr1[i]);
	}
	
	// al1=  Collections.synchronizedList(al2);
	 
	 return al1;
	}
	}
	
	public static void main(String[] args) {
		
Test1 t1 = new Test1();
t1.m1();
	
	System.out.println("Main thread shows the List as " + t1.al1 );

	Thread th1 =new Thread (()-> {t1.al1.set(0, Thread.currentThread().getName());
	System.out.println("Currently executing "+ Thread.currentThread().getName() + " and it retrieves element "+ t1.al1);
	
	});
	th1.start();
	
	Thread th2 =new Thread (()-> {t1.al1.set(0, Thread.currentThread().getName());
	System.out.println("Currently executing "+ Thread.currentThread().getName() + " and it retrieves element "+ t1.al1);
	
	});

	
	Thread th3 =new Thread (()-> {t1.al1.set(0, Thread.currentThread().getName());
	System.out.println("Currently executing "+ Thread.currentThread().getName() + " and it retrieves element "+ t1.al1);
	
	});
	th2.start();
	th3.start();
	
	}
	
	
	
}
