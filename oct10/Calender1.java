package oct10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		String dol = "2025-Feb-7";
		String temp[]=dol.split("-");
		String year =temp[0];
		String month =temp[1];
		String date = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		//click leave
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		//click calendar button
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		Thread.sleep(5000);
		//select month from calender
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);	
		Thread.sleep(5000);
		//slect year from calender
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows= webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
		        }
		        }
            	}

}
