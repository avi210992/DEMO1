package Package2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test13< T extends Number > {
	
	T n1;
	
	 T apply(T n2)
	{
		return n2;
	}
	
	 Test13(T n1)
	{
		this.n1 = n1;
	}
	
	  void m2(Test13 ref1)
	 {
		 System.out.println(ref1.n1);
	 }
	public static  void main(String[] args) {
		
		
	Test13<Integer> t1= new Test13<Integer>(10);
	Test13<Double> t2 = new Test13<Double>(10.0);
System.out.println(	t2.apply(100.0));
System.out.println(t1.n1.getClass().getName());
System.out.println(t2.n1.getClass().getName());
	
List<Test13> al1 = new ArrayList();

	al1.add(t1);
	al1.add(t2);
	
			Iterator<Test13> it = al1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next().n1);
			}
	
	t1.m2(t2);
	
	
	}
	
	
	
}


