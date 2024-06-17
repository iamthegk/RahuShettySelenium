package scroll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// for scrolling features we have to use JS executor
		// use console in the chrome to verify the js scripts
		JavascriptExecutor js= (JavascriptExecutor)driver; //casting 
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//scroll on a particular component
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
		
		
		
	}

}
