package seleniumTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleEverytime {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
			Set<String> handles=driver.getWindowHandles(); 
			//converting from Set to List ie..Converting non-order based collection to order based collection
			List<String> handlesList=new ArrayList<String>(handles);  //order based collection
			
			String parentWindowID=handlesList.get(0); //Always parent ID
			System.out.println("Parent window id:" + parentWindowID);
			
			String childWindowID=handlesList.get(1);
			System.out.println("Child window id:" + childWindowID);
			
			
			//switching from parent window to child window
			driver.switchTo().window(childWindowID);
			System.out.println("child window url :" + driver.getCurrentUrl());
			
			driver.close() ; //child window is closed and driver is lost
			
			//so now coming back to parent window from child window
			driver.switchTo().window(parentWindowID);
			System.out.println("parent window url :" + driver.getTitle());
			//without switching back to parent window if we try to get the title we get NosuchWindowException 
			
			driver.quit();//parent window will be
			
			
			
			
			
			
			
	}
}