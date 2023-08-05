package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider(name="searchData")//we can give name to dataProvider ---then we can use name of dataprovider or methodname
	public Object[][] searchTestData() {
		
		return new Object[][] { //here we cannot use single dimension,selenium deosn't supports
			{"macbook",3}, //when searched for particualr product how many results we are getting
			{"imac",1},
			{"samsung",2},
			{"canon",1},
			
		};
	}
	
	@Test(dataProvider="searchData")
	public void searchTest(String searchKey,int expSearchCount) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(searchKey);
		driver.findElement(By.cssSelector("div#search button")).click();
		
		String header=driver.findElement(By.cssSelector("div#content h1")).getText();
		System.out.println(header);
		Assert.assertTrue(header.contains(searchKey));
		
		int actSearchCount=driver.findElements(By.cssSelector("div.product-layout")).size();
		System.out.println(searchKey +"count===> " + actSearchCount);
		Assert.assertEquals(actSearchCount, expSearchCount);
		
		

	}

}
