package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatinUiElementsEnabledDisabled {

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
		

		
		System.out.println(driver.findElement(By.xpath("//span[@id='spclearDate']")).getAttribute("style"));
		
		// Clicking roud trip option
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.xpath("//span[@id='spclearDate']")).getAttribute("style").contains("block")){
			System.out.println("the return date is enabled");
		}
		else {
			Assert.assertTrue(false);
		}
		
		System.out.println("okk");
		driver.close();

	}

}
