package oct9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTableData {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//get collection of rows in a table
		rows =webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are::"+row);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get column from each row
			cols =eachrow.findElements(By.tagName("td"));
			//iterate each  row cell
			for (WebElement eachcell : cols) {
				Thread.sleep(1000);
				System.out.print("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("==============================================");
		}
		driver.quit();

	}

}
