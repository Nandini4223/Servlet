package BasicPrograms;

public class Exception {
	public static void main(String[] args)
	{
		try
		{
			int d=23/5;
			System.out.println("data");
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("all ways excicuted");
		}
		System.out.println("code is rested");
	}

}
