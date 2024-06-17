package miscelleanous;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		File screenshot=driver.findElement(By.cssSelector("[name='name']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("image.png"));

	}

}
