package oct10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		String dob ="20/December/2000";
		String temp[]=dob.split("/");
		String date =temp[0];
		String month =temp[1];
		String year =temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		//switch to farme
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//select year from calender
		String calyear =driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			//click previos button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture month from calsendr
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month)) {
			
			//click previos button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols= eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
			}
		}

	}

}
