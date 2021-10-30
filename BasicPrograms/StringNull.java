package BasicPrograms;

public class StringNull {
	public static boolean isStringNull(String str)
	{
		if(str==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		String s1="Nandhu";
		String s2="Null";
		System.out.println("is String["+s1+"]null"+isStringNull(s1));
		System.out.println("is String["+s2+"]null"+isStringNull(s2));
	}
	}