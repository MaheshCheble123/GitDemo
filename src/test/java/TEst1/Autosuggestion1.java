package TEst1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		String expText="facebook login";
		driver.findElement(By.id("APjFqb")).sendKeys("facebook");
		
		Thread.sleep(2000);
		List<WebElement> MultipleElements = driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		
		Thread.sleep(5000);
		
		for(WebElement singleElement:MultipleElements) 
		{
			String actText= singleElement.getText();
			if(actText.equalsIgnoreCase(expText)) {
				singleElement.click();
				break;
			}
		}
		
				
	
	}

}
