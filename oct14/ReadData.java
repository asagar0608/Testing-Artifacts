package oct14;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args)throws Throwable {
		// read path of file
		try {
		FileReader fr = new FileReader("D:/Sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String str ="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
		}
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
