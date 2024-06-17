package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));// this is Global - applicable to all
		// lines/step following by.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Gopirkishnan");
// CSS regular expression - with partial text
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);// to avoid intercept error for below line
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
// xpath regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		String actual=driver.findElement(By.tagName("p")).getText();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		String expected ="You are successfully logged in.";
		Assert.assertEquals(actual,expected);
		
		// identification using texxt
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		
		driver.close();

	}

}
