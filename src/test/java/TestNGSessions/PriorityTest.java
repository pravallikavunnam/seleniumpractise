package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	
	//we can run only @Test 
	//if we want to run @Test as per required sequence instead alphabetical we set the priority 
	//default priority is always 0 so it will execute with priority 0 and then priority -1
	// if we give negative priority it will be executed first 
	// priority -1 and priority -90 then priority -90 will be executed first
	//if we have priority for few test cases and no priority set for few test cases
	//then @Test with no priority in alphabetical order will be executed first
	//and the @Test with priority will be executed
	
	//If we have @Test with same priority --then it will execute based on aplhabetical order it won't consider priority
	
	
	
	@Test(priority=1)
	public void searchTest() {   
		System.out.println("searchTest");   
		Assert.assertEquals("Google", "Google"); 
	}
	
	@Test (priority=2)
	public void cartTest() {
		System.out.println("cartTest");   
		Assert.assertEquals("macbook", "macbook");
	}
	
	@Test (priority=3)
	public void orderTest() {
		System.out.println("orderTest");   
		Assert.assertEquals(1000,1000);
	}
	
	@Test (priority=3)  //it will be running first 
	public void paymentTest() { 
		System.out.println("paymentTest");   
		Assert.assertEquals("300$", "300$");
	}
	
	@Test (priority=3)
	public void emailTest() {
		System.out.println("emailTest");   
		Assert.assertEquals("email is sent","email is sent");
	}
	

}
