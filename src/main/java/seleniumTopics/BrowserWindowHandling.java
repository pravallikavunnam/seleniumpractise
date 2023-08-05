package seleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent window
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//opens in new tab  --child window
		//so if we want to switch from parent window to child opened  window
		
	//	driver.switchTo().window(null);// WINDOW method asks to give nameOrHandle of particular window
		//nameOrHandle means---window ID of that particular window 
		//we need to capture windowID by using driver.getWindowHandles();
		
		Set<String> handles=driver.getWindowHandles(); //gives set of strings---whenever we have more than one window we use this method
		//store in set of string object
		//set is coming from java.Util package
		//difference between Set and List
		//List is order based collection
		//Set is not order based--2 properties of set
		//1) set doesn't maintain any order 2) set cannot have duplicate values
	
		Iterator<String> it=handles.iterator();//we use iterator on those java based collections which desn't maintain order
		                     //iterate this particular set of objects
		                     //Iterator method return type is Iterator of String
		//why it is taking as string --set is having string values so iterator also having string values
		//iterator starts pointing just up of this first segment of set objects
		
		String parentWindowID=it.next();//moving the iterator--go to the next segment in the memory 
		                               //and return the value at particular location and returns as string
		System.out.println("Parent window id is:" + parentWindowID);
		
		String childWindowID=it.next() ;//get the child window id		
		System.out.println("Child window id is:" + childWindowID);
		
		//switching from parent window to child window
		driver.switchTo().window(childWindowID);
		System.out.println("child window url :" + driver.getCurrentUrl());
		
		driver.close() ; //child window is closed and driver is lost
		
		//so now coming back to parent window from child window
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window url :" + driver.getTitle());
		//without switching back to parent window if we try to get the title we get NosuchWindowException 
		
		driver.quit();//parent window will be closed
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

//if we have target="_blank" ---then link will open in new window or new tab
//if it is not there then link will open in the same page



