package TEst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		//Launch browser
		//Open url
		//validate title
		//closed browser
		WebDriver driver = new ChromeDriver();// Example of upcasting
		
		driver.get("https://demo.opencart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Your Store")) //comparing string used equals method
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
			
		}
		
		//driver.close();
		driver.quit();
		
	
		
	}

}
