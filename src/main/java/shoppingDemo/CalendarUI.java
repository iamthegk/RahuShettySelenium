package shoppingDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String parentID = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class=\"cart-header-navlink\"][1]")).click();
		Set<String> windoIds = driver.getWindowHandles();
		Iterator<String> I1 = windoIds.iterator();
		while (I1.hasNext()) {
			String childWindow = I1.next();
			if (!parentID.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}

		}
		driver.findElement(By.xpath("//div[@class=\"react-date-picker__inputGroup\"]")).click();
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expected = { monthNumber, date, year };

		driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__label\"]/span")).click();
		driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__label\"]/span")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(monthNumber) - 1).click();
		driver.findElement(By.xpath("//abbr[text()=" + date + "]")).click();
		String actual = driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText();
		List<WebElement> listOfActualValues = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < listOfActualValues.size(); i++) {
			listOfActualValues.get(i).getAttribute("value");
			Assert.assertEquals(listOfActualValues.get(i).getAttribute("value"), expected[i]);

		}
		driver.close();
	}

}
