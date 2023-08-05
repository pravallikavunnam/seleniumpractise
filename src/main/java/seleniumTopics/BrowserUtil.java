package seleniumTopics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import customExceptions.FrameworkException;

//All Browser related wrapper methods/Utility methods/Generic methods are created and internally using selenium API's
/**
 * 
 * @author Pravallika
 *
 */

public class BrowserUtil {

	private WebDriver driver; // creating webDriver reference variable at class level

	// why declared driver as private because to avoid unnecessary access of driver
	// in other class like brUtil.driver

	// we are using private driver and using it in public class ---encapsulation
	// concept

	// why we declared driver at global level instead of inside method ---because
	// with the help of driver we can create other utility methods also

	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * Valid browsers =Chrome/Firefox/Edge
	 * @param browserName
	 */
	public WebDriver launchBrowser(String browserName) { // for launching browser we need to provide browser

		System.out.println("Browser name is:" + browserName);
		if (browserName == null) { // If we pass null in place of browsername
			System.out.println("Browser cannot be null");
			throw new FrameworkException("BROWSERCANBENOTNULL");
		}

		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "Edge":

			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser name:" + " " + browserName);
			throw new FrameworkException("NOTVALIDBROWSER");

		}
		return driver;
	}
  /**
   * This method is used to enter URL
   * @param url
   * 
   * Below is an example of method overloading 
   * enterURL method overloaded with url as string where using get method
   * enterURL method with url as URL where converting url from URL type to string and using naviagte.to()
   */
	public void enterURL(String url) {
		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new FrameworkException("Url should have http or https");
		}
	}
     
	public void enterURL(URL url) {
		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		} else {
			throw new FrameworkException("Url should have http or https");
		}
	}
	
	public String getPageTitle() {

		return driver.getTitle();

	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {

		driver.close();

	}

	public void quitBrowser() {

		driver.quit();
	}

}
