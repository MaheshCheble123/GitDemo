package TEst1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//It will open a new Tab
		
		//To get id of main page and child page will use getWindowHandles method.
		Set<String> AllIDs = driver.getWindowHandles();
		 System.out.println(AllIDs);
		 
		 //Get only childid
		 
		 String ChildID = driver.getWindowHandle();
		 System.out.println(ChildID);
		 
		 ArrayList<String> al = new ArrayList<String>(AllIDs);
		 String childWindoID = al.get(1);
		 System.out.println(childWindoID);
		 
		 driver.switchTo().window(childWindoID);
		 //driver.findElement(By.xpath("//i[text()='About me']")).click();
         driver.findElement(By.xpath("//a[@id='default-btn-b3e6bb53916424a5f3e6a73b1e76d865']")).click();
         
         
	}

}
