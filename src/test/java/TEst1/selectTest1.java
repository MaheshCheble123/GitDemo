package TEst1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTest1 {
	
public static void main(String[] args) throws InterruptedException
{
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(3000);
	
	
	//driver.findElement(By.xpath("//input[@id='u_2_8_+v']"));
    //driver.findElement(By.name("firstname")).sendKeys("Mahesh");
	
	//identify Listbox, find webelement and store in reference.
	 
	WebElement month1 = driver.findElement(By.xpath("//select[@id='month']"));
	
	//Create an object of select class which accept webelement args.
	   Select s =new Select(month1);
	   
	   //s.selectByIndex(2);
	   //s.selectByVisibleText("Oct");
	   s.selectByValue("12");
	
	
	
}

}
