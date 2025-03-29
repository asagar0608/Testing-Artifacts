package oct16;

public class Demo {

	public static void main(String[] args) {
		//divide any thing with zero
		try {
			int x=987,y=0,z;
			z=x/y;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		 int a=8765,b=8,c;
		 c=a/b; 
		 System.out.println(c);
		 
	}

}
