package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 //1. Identify dropdown element which needs to be handle
	 WebElement login = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
	 
	 //2. Create an object of Actions class with web driver object as an input
	 Actions act = new Actions(driver);
	 
	 //3. Call actions method
	 act.moveToElement(login).perform();
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@title='My Profile']")).click();
	 
	 System.out.println("Git demo project Excution");
	 System.out.println("Git demo project Excution1");
	 System.out.println("Git demo project Excution2");
	 System.out.println("Git demo project Excution3");
	 

	}

}
