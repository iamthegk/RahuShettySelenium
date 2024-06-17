package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingJavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text = "Gopi";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// clicking ok in the alertbox
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();// to click CANCEL
		System.out.println(driver.switchTo().alert().getText());
	}

}
