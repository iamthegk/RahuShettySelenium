package scroll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SumOfComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
		List <WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		String value=driver.findElement(By.cssSelector(".totalAmount")).getText();
		String splitValue=value.split(":")[1].trim();
		int actual=Integer.parseInt(splitValue);
		Assert.assertEquals(sum,actual);
		
		
	}

}
