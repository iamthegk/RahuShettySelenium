package base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicDropDown {

	
	/*PROGRAM FOR DYNAMIC DROP DOWNS*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// SELECTING ORIGIN
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		//SELECTING DESTINATION
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// (//a[@value=\"TRV\"])[2] This is selecting second xpath from matching xpaths
		
		//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']
		
		//driver.findElement(By.xpath("(//a[@value=\"TRV\"])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='TRV']")).click();
		
		
		//  we can use this prent child relation xpath incase your company dosen't allow indexed xpath
		
		

	}

}
