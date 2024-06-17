package miscelleanous;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAnitherURLUsingSingleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String parentId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB); // open new tab using selenium 
	//	driver.switchTo().newWindow(WindowType.WINDOW); // for opening new Windows
		Set<String> childWindowsIds=driver.getWindowHandles();
		Iterator<String> it1= childWindowsIds.iterator();
		while(it1.hasNext()) {
			String childWindow=it1.next();
			if(!parentId.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.get("https://rahulshettyacademy.com/");
			}
		}
		
		String firstCourseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.close();
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(firstCourseName);
		
		
		
	
		

	}

}
