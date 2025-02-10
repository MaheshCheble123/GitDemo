package TEst1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("XYZ123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//To hanlde alert popup we need to switch selenium focus from main page to alert popup by using syntax.
		//Alert alt = driver.switchTo().alert();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		

	}

}
