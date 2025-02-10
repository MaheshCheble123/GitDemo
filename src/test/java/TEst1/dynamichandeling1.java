package TEst1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamichandeling1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//   driver.findElement(By.xpath("//"))
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//title[text()='Search Icon']")).click();
		
	}
}
