package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//1.Identify the source and destination element
		WebElement src= driver.findElement(By.xpath("//a[@class='button button-orange'][1]"));
		WebElement des= driver.findElement(By.xpath("//li[@class='placeholder'][2]"));
		Thread.sleep(5000);
		
		//2. Create an object of Actions class and pass Webdriver as an input in its constructor
		Actions act = new Actions(driver);
		
		//3. Use action class methods to perform actions
		act.dragAndDrop(src, des).perform();
		

	}

}
