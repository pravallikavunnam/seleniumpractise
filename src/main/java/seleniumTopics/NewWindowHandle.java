package seleniumTopics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class NewWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
	//		driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			String parentWindowID=driver.getWindowHandle();
			
			//From selenium 4 we got new feature newWindow --for Tab and Window
		//	driver.switchTo().newWindow(WindowType.TAB);   //for opening new TAB
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			
			driver.close(); //Session ID will be there ,but it will be expired
			                //we use to close the child window
			
			driver.switchTo().window(parentWindowID);
			System.out.println(driver.getTitle());
			
						
		//	driver.quit();
				
			

	}

}
