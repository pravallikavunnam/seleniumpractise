package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	int userID; //NEVER HARDCODE YOUR DATA 

	// CRUD--ADD/GET/UPDATE/DELETE

	//create a generic createsuser method
	public int addUser() {
		System.out.println("Add the user");
		int userId=123;
		return userId;
	}
	@Test (priority=1)
	public void addUserTest() {
		int userID=addUser(); //When called generic method it will always create a new user ID
		Assert.assertEquals(userID, 123);
	}

	//Always test cases should be independant
	//it is better to create a workflow in each method instead depending on other methods
	//login->homepage->Search->Cart->Payment->test
	@Test
	public void getUserTest() {
		int userID=addUser();
		System.out.println("Get the user id for:" + userID);
	}
	@Test
	public void updateUserTest() {
		int userID=addUser();
		System.out.println("Update the user id for:" + userID);
	}
	@Test
	public void deleteUser() {
		int userID=addUser();
		System.out.println("Delete the user id for:" + userID);
	}

}
