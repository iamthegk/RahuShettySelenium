package miscelleanous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorsDemoImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement editBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(editBox)).getText());
		driver.findElement(with(By.tagName("input"))).click();

	}

}
