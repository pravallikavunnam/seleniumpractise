package myTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	
	@Test(priority=1)
	public void orangeHRMTitleTest() {
		Assert.assertTrue(driver.getTitle().contains("30-Day Advanced Free Trial | OrangeHRM"));
		
	}
	
	@Test(priority=2)
	public void orangeHRMURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial/"));
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	
	

	
	
	
}
