package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	
	//Invoke means run and count means number of times---so same test will be run for 10 times
	//if we want to a run a specific number of time then we give invocationCount
	@Test(invocationCount=10 ,priority=1 , expectedExceptions=Exception.class)
	public void searchTest() {   
		System.out.println("searchTest");   
		Assert.assertEquals("Google", "Google"); 
	}
	
	@Test (priority=2)
	public void cartTest() {
		System.out.println("cartTest");   
		Assert.assertEquals("macbook", "macbook");
	}

}
