package oct14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Demo {

	public static void main(String[] args)throws Throwable {
		// create new file and write some text
		try {
		File f = new File("D:/ample.tt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Iam learning .net");
		bw.newLine();
		bw.write("Iam learnig java");
		bw.newLine();
		bw.write("Iam learnig python");
		bw.flush();
		bw.close();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
