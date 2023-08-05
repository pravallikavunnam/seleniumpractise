package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomXpath {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		driver=brUtil.launchBrowser("chrome");
		brUtil.enterURL("https://app.hubspot.com/login");
		
		//Xpath : Address of element in the HTML DOM
		//Two types of Xpath
		//1. Absolute Xpath --creating xpath on the basis of position
		//2. Relative Xpath/Custom Xpath---On the basis of some specific properties of the xpath we can use it 
		//this is custom xpath using some attributes , using xpath functions ,sibling concepts,Indexing concepts,positioning concepts
		//---creating xpath based on attributes
		//Custom xpath starts from some specific 
		
		//1. htmltag[@attribute='value']----formulae to create simple customized xpath
		
		//  URL : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
		//  Example : //input[@name='username']
		//          //button[@type='submit']
		
		// url : https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//        //input[@id='input-firstname'] --if ID is available go for ID 
		
		//  with xpath i can use any attribute
		//  URL : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
		//      //input[@placeholder='Username']
		
		
		//2. Xpath with multiple attributes
		//   //htmltag[@attribute1='value' and @attribute2='value'] 
		
		//  URL : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
		//	1.//input[@name='username' and @placeholder='Username'] ----2 attributes
		//  2.//input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']-----3 attributes
				//two classes are there --classes are always space seperated
		 		//when we use class with xpath --we should use all classes together 
				//classes can be same for different elements
		
		
		//3. //htmltag[@atribute1 and @attribute2 and @attribute3]
		//  URL : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
		//  //input[@name and @class and @placeholder] 
	
		//Url : https://app.hubspot.com/login
		//    //input[@class='form-control private-form__control login-email']----Taking class attribute in xpath 
	//	By e1=By.xpath("//input[@class='form-control private-form__control login-email']");// ----Valid
		                                                 //whenever we use class with by.xpath we write all classes together
	//	By e2=By.className("login-email"); //----Valid //whenever we use class with by.className we pass unique class
		
	//	By e3=	By.className("form-control private-form__control login-email");//--Invalid ---with by.classname we cannot pass all classes
		
		
    //	driver.findElement(e1).sendKeys("test@gmail.com"); //Valid
		
	//	driver.findElement(e2).sendKeys("test@gmail.com"); //Valid
		
	//	driver.findElement(e3).sendKeys("test@gmail.com");  //InvalidSelectorException: Compound class names not permitted
		
		
		//4.Contains() as a function in xpath  --we can pass full value or partial vlaue asloe
		//Url : https://app.hubspot.com/login
		//htmltag[contains(@attribute,'value')]
	//  //input[contains(@aria-labelledby,'UIFormControl-label-2')]
		
		//input[contains(@class,'login-email')]  ---contains with class can pass any class
		
	//	By e4=By.xpath("//input[contains(@class,'login-email')]"); //Valid 
		                                         //whenever we use class with by.xpath using contains we pass unique class
		
	//	driver.findElement(e4).sendKeys("test@gmail.com"); //Valid
		
		 
	//	By e5=By.xpath("//input[@class='login-email']"); //Invalid --
															//becoz by.xpath using class should pass all class values not single unique value
	//	driver.findElement(e5).sendKeys("test@gmail.com");  //NoSuchElementException: no such element: Unable to locate element
		
		
	//we generally use contains
	//1.If we have long text value
	//2. whenever we have dynamic attributes/ID's---where some part is fixed and some part keeps changes for page refresh
		//<input id='test_123'>
		//<input id='test_456'>----so in this dynamic cases we can use contains using partial link text
		//input[contains(@id,'test_')]
		
	
	//5. Contains() with attribute1 and attribute2 without contains()
		//htmltag[contains(@attribute1,'value') and @attribute2='value']
	//url : https://app.hubspot.com/login	
	//	//input[contains(@aria-labelledby,'UIFormControl-label-2') and @type='email'] --- 2 attributes
		
	//	//input[@type='email' and contains(@aria-labelledby,'UIFormControl-label-2')] ----sequence of attributes can be in any sequence
		
	// //input[contains(@aria-labelledby,'UIFormControl-label-2') and @type='email' and @id='username'] -- 3 attributes

		
	//6. text() in xpath : used where text of the element is available
		//htmltag[text()='value']
		//url : https://naveenautomationlabs.com/opencart/index.php?route=account/register
		//h1[text()='Register Account']
		
		
	//7.Contains() with text() ---if we have long paragraphs we go for this 
		//htmltag[contains(text(),'value')]
		//span[contains(text(),'businesses of all sizes')]
		
		
	//8. text() with @attribute	
		//htmltag[text()='value and @attribute='value']
	//url : https://naveenautomationlabs.com/opencart/index.php?route=account/login	
		//a[text()='Login' and @class='list-group-item']
		
		
	//9. text() with contains and attribute1 with contians and attribute2 without contains
		//htmltag[contains(text(),'value') and contains(@attribute1,'value') and @attribute2='value']
		//url : https://naveenautomationlabs.com/opencart/index.php?route=account/login		
		//a[contains(text(),'Address Book') and contains(@href,'naveenautomationlabs') and @class='list-group-item']
		
	//10. index/position in xpath
		//url : https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		//when we have many elements with same attribute and value---we have to collect them together in the capture group (//input[@class='form-control'])
		//---this is called capture group---on capture group we apply Index()[1] ie..(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[1]---if we have six elements with same class with index as 1 --it will match with first element
		
		By.xpath("(//input[@class='form-control'])[1]"); //xpath with capture group with Index
		
		//Instead passing direct Index value we can also use position function and pass the Index--both ways are exactly same
		
		By.xpath("(//input[@class='form-control'])[position()=1]");
		
		//without capture group we cannot apply indexing concepts
		
		//there are 6 elements in the capture group captured 
		
		By.xpath("(//input[@class='form-control'])[last()]"); //--when really wants to go for last element of the capture group
		
		
		By.xpath("(//input[@class='form-control'])[last()-1]");//when really want to go for second last element in the capture group
		
		
		// (//input[@class='form-control'])[last()-(last()-1)] //last=6 6-(5-1)==6-5=1---gives 1 position
				
	//	(//input[@class='form-control'])[1]	 -------both the ways gives 1 position element
		
		//whenever we want to move from parent to child --we use / or //
		//we use / when you have direct child
		//we use // when we don't have direct child
		
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]----xpath for help text in amazon footer link
		
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]---Amazon Assistant
		
		
		
		//11. Parent to child concept ---
		//url : https://www.orangehrm.com/en/orangehrm-30-day-trial#free-trial-info-menu
		//   ---//parent/child for direct child association  
		//   ex--//select[@id='Form_getForm_Country']/option
					//or
				//select[@id='Form_getForm_Country']/child::option
		
		//   ----//parent//child for direct and indirect child association 
		//     ex: //div[@class='footer-main']//a
		
		//form//input[@id='username']
		
		//12. Child to Parent or Backward traversing in xpath we use /..
		//url : https://app.hubspot.com/login/beta
		//input[@id='username']/../../../../../../../../../../../../../../../../..
		    //or---we can use parent keyword
		//input[@id='username']/parent::div  ---for traversing from child to immediate parent
		
		//input[@id='username']/ancestor::form   ---for traversing from child to grand parent
		
		//url: https://www.orangehrm.com/en/orangehrm-30-day-trial#free-trial-info-menu
		
		//option[contains(text(),'Country')]/parent::select
		
		
		
		
	}

}
