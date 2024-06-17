package base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));// this is Global - applicable to all
																			// lines/step following by.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Gopirkishnan");
		// name locator
		driver.findElement(By.name("inputPassword")).sendKeys("gopi");
		// class name locator
		driver.findElement(By.className("signInBtn")).click();
		// css selector locator
		String errorMessage = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorMessage);

		// link text locator
		driver.findElement(By.linkText("Forgot your password?")).click();

		// xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gopi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("gopi@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7418529630");

		// parent child xpath
		driver.findElement(By.xpath("//form/input[3]")).clear();
		//
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		// css selector
		String message = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(message);

		// css sekector
		driver.findElement(By.className("go-to-login-btn")).click();
		// Parent child travers
		// driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		// id locator
		driver.findElement(By.id("inputUsername")).sendKeys("Gopirkishnan");
		// CSS regular expression - with partial text
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);// to avoid intercept error for below line
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		// xpath regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
