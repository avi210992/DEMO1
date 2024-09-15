package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11 {
	
	
	
	public static void main(String[] args) {
		
		
	    
	    Runner[] arr1 = new Runner[10];
	    for (int j = 0;  j < 10 ; j++)
	    {
	
	    arr1[j] = new Runner();
	        
	    }
	    
	    ExecutorService pool = Executors.newFixedThreadPool(3);   
for (int i = 0 ; i< arr1.length ; i++)
{
	pool.execute(arr1[i]);
}
	    
	
	pool.shutdown();
	
	}

}


class Runner implements Runnable
{
	public synchronized void run()
	{
		for (int i = 0; i<10; i++)
		{
			System.out.println("Currently executing " + Thread.currentThread().getName() + "for the iteration" +i);
			
		}
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}