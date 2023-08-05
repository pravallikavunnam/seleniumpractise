package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
		//here in this class @BeforeTest and @AfterTest will be executed only once before @Test methods executed and after that 
		//we go for this approach when system is simple and stable 
		//whenever we are writing sanity test cases and partial regression we can go for this approach
//	
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	@Test(priority=2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		
	}
	
	@Test(priority=3)
	public void googleSearchTest() {
		
	//	Assert.assertEquals(driver.getTitle(), "Google");
		
		driver.findElement(By.name("q")).sendKeys("Selenium"); //testSteps
		driver.findElement(By.name("q")).submit();
		//With assertion it will become test case
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		//if we have multiple assertions in a test
		//If first Assertion is failed then it won't go to any other upcoming lines of code
		//program will be terminated
		//so test cases should be Independant / written separately
		//we should not mix two features in one single test
		
		//Always we have to follow AAA rule 
		//AAA rule for unit test ---Arrange-Act-Assert 
		//Arrange ---arrange preconditions
		//Act  --write test steps
		//Assert --write assertion
		
		//One Test one Assertion we have to follow
		
		//
		
		
	}
	
	
	
	
	
	

}
