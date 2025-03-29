package oct17;
public class Sample {
//non static global variables
	int a,b,c;
	public void multiplication()
	{
	a=987655;
	b=876;
	c=a*b;
	System.out.println(c);
	}
	public void substraction()
	{
		a=8765;
		b=87;
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// create reference object to call non static methods
		Sample s = new Sample();
		s.multiplication();
		s.substraction();
	}
}
