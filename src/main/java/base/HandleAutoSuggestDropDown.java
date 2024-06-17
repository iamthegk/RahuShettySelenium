package base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//options come according to input
public class HandleAutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		
		// we are using elements - bcs we are storing multiple elements
		
		List<WebElement>options=	driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			
		}
	
	}

}
