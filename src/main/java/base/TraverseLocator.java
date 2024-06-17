package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraverseLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));// this is Global - applicable to all
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//PARENT TRAVERS
		//header/div/button[1]
		// Sibling travel : suppose in a scenarios u have to click the next button beside a button
		//header/div/button[1]/following-sibling::button[1]
		String textName=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(textName);
		
		//CHILD TO PARENT TRAVERS
		String textName2=driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(textName2);
		driver.close();

	}

}
