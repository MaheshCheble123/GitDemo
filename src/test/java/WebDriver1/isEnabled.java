package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\TestAutomation2\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).isEnabled();
		
		if(result==true) {
			System.out.println("Element is enable");
		}
		else
		{
			System.out.println("Element is disable");
		}
		
boolean result1 = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).isDisplayed();
		
		if(result1==true) {
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		
		
	}

}
