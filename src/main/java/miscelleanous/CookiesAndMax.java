package miscelleanous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("cookiename");//delete particular cookie
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
