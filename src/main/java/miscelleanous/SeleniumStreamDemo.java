package miscelleanous;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[@class='cart-header-navlink'][1]")).click();
		String Parent = driver.getWindowHandle();
		Set<String> childs = driver.getWindowHandles();
		Iterator<String> i1 = childs.iterator();
		while (i1.hasNext()) {
			String child = i1.next();
			if (!Parent.equals(childs)) {
				driver.switchTo().window(child);

			}
		}

		// click on coloumn sort button
		driver.findElement(By.xpath("//tr//th[1]")).click();
		// get element
		List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		// get text from webelement
		List<String> originalItems = items.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort and store in to new list
		List<String> sortedList = originalItems.stream().sorted().collect(Collectors.toList());
		// comparing both lists
		Assert.assertTrue(originalItems.equals(sortedList));

		// scan items get the price of rice items
		List<String> price = items.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPrice(s))
				.collect(Collectors.toList());
		price.forEach(g->System.out.println(g));

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub

		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return price;
	}

}
