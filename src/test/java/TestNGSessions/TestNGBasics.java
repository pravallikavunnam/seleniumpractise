package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {   //TestNG  JAVA CLASS---usning testng annotations
	
	//Manal testing process
	//Global Precondition ----server working and data available in the system
	//Pre Condition ---  credentials 
	//test Steps
	//Expected vs Actual---->Like Assertion---->Pass/Fail
	// Post Steps---like closing browser,logout
	
	//Annotations in TestNG
	
	//Global PreConditions or PreConditions
	//Every Annotation in TestNGshould be associated with method
	//1
	@BeforeSuite 
	public void connectWithDB() {
		System.out.println("BS---connectWithDB");
	}
	
	//2 --After connecting with Database we need to create a user
	@BeforeTest
	public void createUser() {
		System.out.println("BT---createUser");
	}
	
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launchBrowser");
	}
	
	//4
	@BeforeMethod
	public void logIntoApp() {
		System.out.println("BM---logIntoApp");
	}
	
	//5. 
	//Test Steps--In TestNG test steps should be written with @Test
	
	//these are test cases---we can write n number of test cases
	//atleast one test should be there
	//TestNG methods should not return any value
	//Always be void in nature
	//
	
	@Test
	public void searchTest() {   //Always add test for the methods with @test annotation
		System.out.println("searchTest");   //just print the statement
		//To check validation ie Test is passed or Failed so we use Assert
		//In order to Assert TestNG we write a class
		Assert.assertEquals("Google", "Google"); //Actual ,Expected
	}
	
	@Test
	public void cartTest() {
		System.out.println("cartTest");   
		Assert.assertEquals("macbook", "macbook");
	}
	
	@Test
	public void orderTest() {
		System.out.println("orderTest");   
		Assert.assertEquals(1000,1000);
	}
	
	
	//Post Steps
	@AfterMethod
	public void logout()
	{
		System.out.println("AM----logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AM----closeBrowser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AM----deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB()
	{
		System.out.println("AM----disconnectWithDB");
	}
	
	
	
	//In which sequence annotations are running 
	//as there is no main method
	//testng will decide the priority
	//1. @BeforeSuite   ---executed only once
	//2. @BeforeTest    ---executed only once
	//3. @BeforeClass   ---executed only once
	//4. @BeforeMethod --will be running before each and every @Test---if we have 3 @test--3 times it will be executed
	//5. @Test ie.., cartTest-----will execute if we have multiple tests in the aplbhabetical order
	//6. @AfterMethod ----will be running after each and every @Test---if we have 3 @test--3 times it will be executed
	//7. @BeforeMethod 
	//8. @Test ie.., orderTest
	//9. @AfterMethod
	//10. @BeforeMethod
	//11. @Test ie.., searchTest
	//12. @AfterMethod
	//13. @AfterClass
	//14. @AfterTest
	//15. @AfterSuite
	
	//TestNG will always follow predefined Sequence of annotations even if write them in any order
	
	// It is not mandatory to write @BeforeSuite/@BeforeTest or @AfterSuite/@AfterTest
	
	//Without @Test methods we cannot execute so it is always mandatory to write @Test
	
	//If we have @Test methods 10 and if we want to run only specific test then selec test --right click--run as TestNg
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
