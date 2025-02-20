package Test;

public class ExceptionHandling {
	public static void main(String[] args) 
	{
		try {
		System.out.println("Exception Handling Example");
		int i = 1/0 ;
		System.out.println("Done");
		}
		
		catch(Exception e)
		{
			System.out.println("Resaon is : "+ e.getMessage());
			System.out.println("cause is : " + e.getCause());
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Finally block");
		}
		
	}
	
}
