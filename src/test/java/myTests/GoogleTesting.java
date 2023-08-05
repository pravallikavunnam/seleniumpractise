package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTesting {
	//here in this class @BeforeMethod and @AfterMethod will be executed when each @Test is executed
	//we go for this approach when system is complex and not stable 
	//when we have lengthy regression test  like 200 or 300 test cases then we go for this approach
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	@Test(priority=2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Google"));
		
	}
	
	@Test(priority=3)
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium"); //testSteps
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	

}
