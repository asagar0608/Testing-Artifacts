package oct17;
public class Demo {
	//static global variables
static int x,y,z;
public static void addition()
{
	x=765;
	y=876;
	z=x+y;
	System.out.println(z);
}
public static void division()
{
	x=9876;
	y=98;
	z=x/y;
	System.out.println(z);
}
public static void main(String[] args) {
		//calling static method with class name
		Demo.addition();
		Demo.division();
		}
        }
