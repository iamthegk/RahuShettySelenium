package assignments;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TableRowColoumnAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name=\"courses\"]//tr"));
		System.out.println("No of row: "+rows.size());
		List<WebElement> coloumn=driver.findElements(By.xpath("//table[@name=\"courses\"]//tr//th"));
		System.out.println("No of coloumn: "+coloumn.size());
		System.out.println(driver.findElement(By.xpath("//table[@name=\"courses\"]//tr[3]")).getText());
		
		driver.close();

	}

}
