package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);// ACTION CALSS
		actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();//context click means right click
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("samsung s22").build().perform(); // Typing in capital leter
		
		
		

	}

}
