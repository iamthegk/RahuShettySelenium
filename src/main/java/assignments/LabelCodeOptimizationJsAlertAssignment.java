package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LabelCodeOptimizationJsAlertAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// select one checkbox
		WebElement option = driver.findElement(By.id("checkBoxOption2"));
		option.click();
		String valueOfOption = option.getAttribute("value");
		System.out.println(valueOfOption);
		WebElement selectDropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectDropDown);
		select.selectByValue(valueOfOption);
		driver.findElement(By.id("name")).sendKeys(valueOfOption);
		driver.findElement(By.id("alertbtn")).click();
		String alertBoxText = driver.switchTo().alert().getText();
		System.out.println(alertBoxText);
		String[] newAlertBoxText = alertBoxText.split(",");
		String[] formatText = newAlertBoxText[0].toString().split(" ");
		String splitText=(formatText[1]);
		System.out.println(splitText);
		List newAlertBoxTextList = Arrays.asList(formatText);
		if (newAlertBoxTextList.contains(valueOfOption)) {
			System.out.println("Success");
		} else {
			System.out.println("fail");
		}

	}

}
