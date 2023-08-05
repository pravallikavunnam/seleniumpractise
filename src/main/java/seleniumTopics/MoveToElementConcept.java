package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		//User Actions :User is performing some action on the page 
		//	when we want to go parent menu when mover om parent menu only child menu will be displayed
		// drap and drop --i want to drag one element from one location to another location
		// right click --right click and some menu items will get displayed
			
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(3000);
			
		//Go to the menu and mover only---then submenu will be displayed  ---two level menu items
		
//		WebElement parentMenu=driver.findElement(By.className("menulink"));
		
		//we have to do mouse movements to perform any action on particular element --we use Actions class
		
		//Create an object of Actions class
		
		Actions act=new Actions(driver); //In Actions class default construction supply driver
		                                    //In Select class default constructor supply WebElemnt
	//	act.moveToElement(parentMenu) ; //asking to give target webElement --nothing works when called the method
		
		//whenever using Actions class method  like act.MoveToElement there are other two methods to use
		//.build()  ----collect the action which need to perform 
			//Action please moveToElement
		//.perform() ----how many actions we are performing only one action here,this method perform the action on the browser
		
		
//		act.moveToElement(parentMenu).build(); //Not Valid --no action performed
		
//		act.moveToElement(parentMenu); //Not Valid --no action performed
		
	//	act.moveToElement(parentMenu).build().perform();
		//action please moveToElement here ,which is captured by build method and gives to perform method where perform method performs action
		//here mouse movement is not done by our system cursor ---Selenium will go the content and open the menu item
		
		//act.moveToElemnt-selenium will generates internal mouse action and then it goes to middle of the element
		//W3C is telling selenium that it should always go to the middle of element whenever performing mouse actions
		
	//  act.moveToElement(parentMenu).perform();
		
		//we can use any one .build.perform or .perform 
		//Difference between them is----selenium says 1. if we have only one user action then we can use .build.perform  ---works
		//2. if you one more single action then you can use directly using .perform   --works
		//3. if you one more single action then you can use directly only .build    --not works
		//3. if we have multiple actions action1 ,action2,action3, then we use .build.perform  --works
		
		//build method will collect all these 3 actions together and give to perform method 
		//---perform method in the same sequence will perform on the browser
		
		
			
		Thread.sleep(1500);
//		driver.findElement(By.linkText("Courses")).click(); //NoSuchElementException
	//	driver.findElement(By.linkText("COURSES")).click();
		
		
		By parentMenu=By.className("menulink");
		By childMenu=By.linkText("COURSES");
		
		doTwoLevelMenuHandling(parentMenu, childMenu);
		
	}
	//create a utility for level 2 menu item
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doTwoLevelMenuHandling(By levelOneMenuLocator,By LevelTwoMenuLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(levelOneMenuLocator)).perform();
		Thread.sleep(1500);
		getElement(LevelTwoMenuLocator).click();
		
	}

}
