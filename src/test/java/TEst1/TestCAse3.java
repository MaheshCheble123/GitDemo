package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCAse3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("mahesh.cheble@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("mahash7777");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("mahesh.cheble@gmail.com");
		driver.findElement(By.id("did_submit")).click();
		driver.findElement(By.xpath("//a[text()='Try another way']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'another')]")).click();
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _aklu _4jy3 _517h _51sy']")).click();
		
	}

}
