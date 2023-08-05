package myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	ChromeOptions co;

	@Parameters({ "browser" ,"url" ,"headless"})
	@BeforeTest
	public void setup(String browserName,String url,String headless) {
		System.out.println("running browser:" + browserName);
		switch (browserName.toLowerCase()) {
		case "chrome":    //everything in testng is string so convert headless return value "true" from string to boolean
			co=new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
			co.addArguments("--headless");
			}
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
			driver = new ChromeDriver(co);
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "Edge":

			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser name:" + " " + browserName);
			break;

		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
