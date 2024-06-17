package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> iframeCount = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no fo Iframes: " + iframeCount.size());

		/*
		 * driver.switchTo().frame(0); this will also work, using index - there is only
		 * one frame available so 0;
		 */
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // now driver control goes to the frame
		// used iframe class name as element to locate the iframe
		driver.findElement(By.id("draggable")).click();
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, drop).build().perform();
		driver.switchTo().defaultContent(); // switch to default main window 	

	}

}
