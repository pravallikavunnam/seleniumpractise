package seleniumTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
				
				//fetching window ID's
				Set<String> handles=driver.getWindowHandles();
				
				//converting set to List --converting non-order based collection to order based collection
				List<String> handlesList=new ArrayList<String>(handles);
				
				String parentWindowID=handlesList.get(0);
				
				String childWindowID=handlesList.get(1);
				
				//switching from parent to child window
				
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

//Difference between quit and close
//1.Session id will be null after that we cannot use driver
//--Close-session ID will be there it will be expired
//2. we have to use driver.close after switching to child window 
//---if we use driver.quit it will close the both the windows


