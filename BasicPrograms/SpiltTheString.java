package BasicPrograms;

public class SpiltTheString {
	public static void main(String[] args)
	{
		String s1="Nano Wicore Labs Ltd";
		String[] n1=s1.split(" ");
		for(String k:n1)
		{
			System.out.println(k);
			
		}
	}

}
