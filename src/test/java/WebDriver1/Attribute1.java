package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute1 {
	
	public static void main(String[] args) {
		//This method is used to initialized the browser and gives path of the browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\TestAutomation2\\\\chromedriver.exe");
		
		//Create object of WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maheshcheble@gmail.com");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("mahesh");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		
		
		
		
		
	}
		
	

}
