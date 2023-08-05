package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0; //but we get any exception in loginTest then the other methods which are dependant on login test will get skipped
	}
	
	//when given dependsOnMethods then priority won't consider  it run the tests as per dependancy only
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() { //it is dependancy on LoginTest method because without login we cannot perform search
		//login() --so create a generic login method and call each time 
		System.out.println("search Test");
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void selectProductTest() {
		//login();
		//search();
		System.out.println("searchProduct Test");
	}
	
	
	
	
	
	
	

}
