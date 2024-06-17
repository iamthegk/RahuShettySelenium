package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		String parentWindow = driver.getWindowHandle(); //Parent window id
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		Set<String> windowIds = driver.getWindowHandles();// getting all open window ids

		Iterator<String> it1 = windowIds.iterator();
		while (it1.hasNext()) {
			String childWindow = it1.next();
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
				driver.close();

			}
		}

		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
