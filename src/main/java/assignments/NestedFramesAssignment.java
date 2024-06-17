package assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NestedFramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		//List<WebElement> totalFramesFirstStep=driver.findElements(By.tagName("frame"));
		//System.out.println(totalFramesFirstStep.size());
		driver.switchTo().frame(0);
		//List<WebElement> totalFramesInsideFirstFrame=driver.findElements(By.tagName("frame"));
		//System.out.println(totalFramesInsideFirstFrame.size());
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
	}

}
