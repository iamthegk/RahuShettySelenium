package windowswitch;
import java.util.Iterator;
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles { 
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

// Load the website
driver.get("http://www.naukri.com/");

// It will return the parent window name as a String
String parent=driver.getWindowHandle();

Set<String>s=driver.getWindowHandles();
System.out.println(s);

// Now iterate using Iterator
Iterator<String> I1= s.iterator();

while(I1.hasNext())
{

String child_window=I1.next();


if(!parent.equals(child_window))
{
driver.switchTo().window(child_window);

System.out.println(driver.switchTo().window(child_window).getTitle());

driver.close();
}

}
//switch to the parent window
driver.switchTo().window(parent);

}
}