package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedException {
	
	String name;
	//whenever any exceptions coming in @Test methods then the methods will be failed
	//expceetedExceptions is a kind of class Array ---so we can create multiple exceptions
	@Test(expectedExceptions= {ArithmeticException.class, NullPointerException.class}) //the test will be passed and handles the exceptions
	public void searchTest() {   
		System.out.println("searchTest");   
		int i=9/0; //AE

		ExpectedException obj =new ExpectedException();
		obj=null;
		obj.name="Chinnu";//NPE  //fail the test because we are expecting AE exception but we are getting NPE
	
	}

}
