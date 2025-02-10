package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8600210940");
	}

}
