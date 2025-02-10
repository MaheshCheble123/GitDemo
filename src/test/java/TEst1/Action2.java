package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login).perform();
		
		driver.findElement(By.xpath("//a[@title='Orders']")).click();
		
		
		
		
		
		
	}
	

}
