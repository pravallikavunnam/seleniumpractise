package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	//Data Driven Approach : DDA means deriving the data from source
	//this source could be a method or an excel also or anything
	//DDA with help of method --which gives data to us and we are using that data
	//this approach is called as Data Driven Approach or Test Parameterization
	//Test Parameterization : same test will be running against total number of rows we have supplied
	
	//Data driven is not a framework it is an approach
	//key word driven is also an approach but now a days its almost depricated
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	//DataProvider is already available with testNG
	//Whenever we create DataProvider method return type will be Two Dimensional Object Array --2D Array
	@DataProvider
	public Object[][] loginTestData() { //in Object Array we can hold any type of data
		
		return new Object[][] {
			
			{"test121212@gmail.com", "test@12121212"},
			{"naveenanimation20@gmail.com", "test@12121212"},
			{"test121212@.@.@gmail.com", "test@12121212121"},
			{"  ", "   "},
			{"!@#!@#!@#", "test12121"}
			
			};  
		//why are we using object is : Object is a class which is non-primitive ,which can hold any type of data
			
	}
	
	//In order to provide data from data provider to method is to create a mapping between @Test and DataProvider
	
	@Test(dataProvider="loginTestData")
	public void loginWithWrongDataTest(String username,String password) {  // we have to maintain two holding parameters because we are suppplying username and password from method
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String errMsg=driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		System.out.println(errMsg);
		Assert.assertTrue(errMsg.contains("Warning: No match for E-Mail Address and/or Password"));
		
	}
	

}
