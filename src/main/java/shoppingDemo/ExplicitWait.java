package shoppingDemo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait webdriverwait = new WebDriverWait(driver,Duration.ofSeconds(5)); // EXPLICIT WAIT
		// EXPLICIT WAIT - USE FOR PARTICULAR ELEMENT, IT IS N0T GLOBAL
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		String[] productsName = { "Brocolli", "Cucumber" };
		addItems(driver, productsName);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))); //EXPLICIT WAIT
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@style='color: green;']")));
		
		
		
		System.out.println(driver.findElement(By.xpath("//span[@style='color: green;']")).getText());
		
		
		
	}

	public static void addItems(WebDriver driver, String[] productsName) {
		// Array decleration for adding multiple products in to ADD TO CART

		int count = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			// format the vegetable names - because in the front end the product name is
			// "Cucumber - 1Kg"
			// do not give names like this, it is not a clean way - so trim the string

			String nameSplit[] = name.split(" "); // splititng the item names
			String formattedName = nameSplit[0].trim();// trimming for removal of whitespaces

			// convert array to arraylist for easy operation
			List arrayList = Arrays.asList(productsName);

			if (arrayList.contains(formattedName)) {
				count++;
				// click on add to cart option
				// here also need findElements
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == productsName.length) { // for stopping the iteration after 2, because in the Array we are
													// checking 2 items
					break;
				}
			}

		}


	
	}
}


