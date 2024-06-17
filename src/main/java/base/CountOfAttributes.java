package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountOfAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count of links on the whole
		System.out.println(driver.findElements(By.tagName("a")).size());
		// particular section link count
		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		
		// Apt way - by creating section driver for particular
		 WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		 System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		

	}

}
