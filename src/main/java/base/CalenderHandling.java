package base;

import java.time.Duration;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		driver.findElement(By.xpath("//input[contains(@id,'originStation1_CTXT')]")).click();
		
		
		// selecting FROM - BLR
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[contains(@text,'BLR')]")).click();
		// selecting Destination TVM
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(@text,'TRV')]")).click();
		
		//CSS Selector for Current date from the calendar using class name
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();		
		
		// finding current date using xpath - Regular expression
		driver.findElement(By.xpath("//a[contains(@class,'state-highlight')]")).click();
		
		
		
		
		
		
		
		driver.findElement(By.id("//input[contains(@id,'rbtnl_Trip_0')]")).click();
		

	}

}
