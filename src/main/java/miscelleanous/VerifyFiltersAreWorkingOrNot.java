package miscelleanous;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyFiltersAreWorkingOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");// will get all element which have rice like brown rice,rice etcc
		List<WebElement>itemsElementList=driver.findElements(By.xpath("//tr/td[1]")); // all items
		//filtering
		List<WebElement> filterdList=itemsElementList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(itemsElementList.size(),filterdList.size());
		
	}

}
