package TEst1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		List<WebElement>  AllLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(AllLinks.size());
		
		//For finding all links always use "//a"
		
		for(WebElement Links:AllLinks) //Use for each loop to print multiple elements
		{
			System.out.println(Links.getText()); //Return all the text of the different elements link
		}
		
	}
	
	
	

}
