package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceWithFindElements { //We have to reinitialize the List of WebElements

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			List<WebElement> footerList=driver.findElements(By.cssSelector("footer a"));//DOMV1
			System.out.println(footerList.size()); //ELE --V1
			
			for(int i=0;i<footerList.size();i++) {
				footerList.get(i).click();//ELE--V1
				System.out.println();
				driver.navigate().back();//DOM V2
				footerList=driver.findElements(By.cssSelector("footer a"));//DOM V2
			}
		
		

	}

}
