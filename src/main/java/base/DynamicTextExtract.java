package base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicTextExtract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));// this is Global - applicable to all
		DynamicTextExtract obj = new DynamicTextExtract();
		String password = obj.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Gopirkishnan");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		
		driver.close();

	}

	public String getPassword(WebDriver driver) throws InterruptedException {

		// lines/step following by.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// link text locator
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String textOfPassword = driver.findElement(By.className("infoMsg")).getText();
		System.out.println(textOfPassword);

		// SPLIT
		String[] arrayOfPass = textOfPassword.split("'");
		String[] extractedPass = arrayOfPass[1].split("'");
		String password = extractedPass[0];
		return password;

	}

}
