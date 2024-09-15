package Package1;

public class Test5 {

	
	public static void main(String[] args) {

	
		
		for (int i =1 ; i <=3 ; i++)
		{
			for (int space = 2 ; space > i-1 ; space--)
			{
				System.out.print(" ");
			}
				
			{
			for (int j=1 ; j<= 2*i-1; j++)
			{
							System.out.print("*");	
			}
			System.out.println();
		}
		
	}
}
}