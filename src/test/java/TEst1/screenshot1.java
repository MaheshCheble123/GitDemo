package TEst1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.io.FileHandler;


public class screenshot1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//1. typecast webdriver object into Takesscreenshot() Interface
		//2. Call the method getScreenshot() and pass the argument OutputType.FILE
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Mahesh.jpg", null, null, null);
		java.io.File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		Thread.sleep(2000);
		//FileHandler.copy(src, dest);
	}

}
