package base;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxAndGettingTheSizeOfThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		System.out.println();
		// regular expresiion using csc
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// find howmany checkboxes in the page - get the common locator, that is the logic
		System.out.println("No of Checkboxs in the page: "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
