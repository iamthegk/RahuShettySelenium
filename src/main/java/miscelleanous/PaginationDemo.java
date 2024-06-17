package miscelleanous;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PaginationDemo {
	/*
	 * Pagination, what if our particular item is present only in another page table
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
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
				List<String> price;
				// scan items get the price of rice items
				do {
					List<WebElement> itemsForEachpage = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				price = itemsForEachpage.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
						.collect(Collectors.toList());
				price.forEach(g->System.out.println(g));
				WebElement nextButton=driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")); // Next button
				
				if(price.size()<1) {
					
					nextButton.click();
					}
				}while(price.size()<1);
				
				
	
	}


	private static String getPrice(WebElement s){
		// TODO Auto-generated method stub

		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return price;
	}

}
