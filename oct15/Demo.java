package oct15;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {
		try {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("httcebook.com/r.php");
		//store screen shot into one varibale
		File  screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screen shot into local system
		FileUtils.copyFile(screen, new File("D:/Screenshot/Homepage.png"));
		//take screen shot for particular element
		WebElement element = driver.findElement(By.name("firstname"));
	    File scrFile = element.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D:/Screenshot/image.png"));
	    Thread.sleep(5000);
		driver.quit();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
