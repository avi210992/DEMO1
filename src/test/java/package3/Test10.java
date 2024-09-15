package package3;

public class Test10 {
private static	Test10 ref = null;
	private Test10()
	{
		
	}
	
public static Test10 getInstance()
	{
		try {
			if(ref == null)
			{
				return new Test10(); 
			}
			return ref;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ref;
		
		
	}
	
	public static void main(String[] args) {
		
	}

}
