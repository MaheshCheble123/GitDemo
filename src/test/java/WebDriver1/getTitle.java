package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\TestAutomation2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		String Title = driver.getTitle();
		String expTitle= "Online Shopping Site for Mobiles,Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		
		if(Title.equalsIgnoreCase(expTitle))
		{
			System.out.println("Naviagated to current webpage");
		}
		else
		{
			System.out.println("Naviagated to wrong page");
		}
	
	}

}
