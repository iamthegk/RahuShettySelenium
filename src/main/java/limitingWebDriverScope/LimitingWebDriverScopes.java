package limitingWebDriverScope;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebDriverScopes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// count of links on the whole page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Apt way - by creating section driver for particular
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // mini driver creation and limiting the scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// get count of links from first coloumn on the footer - creating mini driver
		WebElement firstColoumnLinks = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstColoumnLinks.findElements(By.tagName("a")).size());
		int sizeOfFirstColoumnLinks = firstColoumnLinks.findElements(By.tagName("a")).size();

		// click on each links and open them on different tabs ctrl+enter will open
		// links in new tab
		for (int i = 0; i < sizeOfFirstColoumnLinks; i++) {

			firstColoumnLinks.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);// open windows in
																										// seperate tabs
			Thread.sleep(5);
		}
		// For printing title of all opened tabs

			Set<String> windowhandles = driver.getWindowHandles();
			Iterator<String> it = windowhandles.iterator();
			int count =0;
			while (it.hasNext()) {
				count++;
				driver.switchTo().window(it.next());
				System.out.println(count+" "+driver.getTitle());
				
			}

		

	}

}
