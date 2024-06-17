package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVE 1\\chromedriver.exe");// global - setting path
		// WebDriver driver = new ChromeDriver(); // webdriver invoke CHROME

		// FIRE FOX
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.firefox.driver", "C:\\DRIVE 1\\geckodriver.exe");
 
		driver.get("https://parabank.parasoft.com/parabank/index.htm"); // hit the url
		System.out.println(driver.getTitle());// to get the title
		System.out.println(driver.getCurrentUrl()); // current url
		driver.close(); // close the current window.
		// driver.quit();// it is closing the driver, which mean it will close all
		// associated windows

	}

}
