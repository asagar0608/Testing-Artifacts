package oct17;
public class Ranga {
public static void add(int x,int y)
{
	int z=x+y;
	System.out.println(z);
}
public static String verifyString(String str1,String str2)
{
	String res ="";
	if(str1.equalsIgnoreCase(str2))
	{
		res ="Strings are Equal";
	}
	else
	{
		res ="Strings are Not Equal";
	}
	return res;
	
}
public static boolean compareValue(int a, int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Ranga.add(1234, 3456);
		String results=Ranga.verifyString("india", "hello");
		System.out.println(results);
		boolean res =Ranga.compareValue(123, 123);
		System.out.println(res);
		
	}

}
