package TEst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		
	}

}
