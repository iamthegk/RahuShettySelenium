package windowswitch;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windowids=driver.getWindowHandles();// to get all the open winods ids[parent//child] 
		Iterator<String> it=windowids.iterator();// to go through the ids
		String parentWindow=it.next();// selects parent window id
		String childWindowId=it.next();//selects child window ids
		driver.switchTo().window(childWindowId);// Switching to child driver
		String emialIdExtract=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emialIdExtract);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(emialIdExtract);
}
}