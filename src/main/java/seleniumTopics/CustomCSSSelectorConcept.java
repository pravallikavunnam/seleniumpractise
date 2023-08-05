package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravallika\\Downloads\\chromedriver114\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
	//	By.cssSelector("input.form-control"); //css selector with class
		
		//1.if ID locator is available then css selector is
		
			// 1. #id
				//Ex: #input-email
			// 2. tagname#id
		   		//Ex: input#input-email
		
		
		//2.if Class locator is available then css selector is
		
			// 1. .class
				//Ex : .form-control
			// 2. tagname.class
				//ex: .form-control
		
		//3. If we have multiple  classes
			//URL : https://app.hubspot.com/login
			//1. .Class1.Class2.Class3.Class4----------.Classn
				//Ex : .form-control.private-form__control.login-email
			//2. input..Class1.Class2.Class3.Class4----------.Classn
				//Ex : input.form-control.private-form__control.login-email
		
		//4. If i want to use only required classes when we have multiple classes,we can write classes in any sequence
			// Ex: input.form-control.login-email -- -  order can be any order
			// Ex: input.login-email.form-control ---- sequence can be in any order
		    // Ex: .login-email                   ---  With only one className where having multiple classes
		
		
		//5. Can i include ID and Class together
			// #id.class
				//Ex : #username.login-email
				//Ex : #username.form-control.private-form__control.login-email
		
			//.class#id       					---we can change sequence also
				//Ex : .login-email#username
				//Ex :  .form-control.private-form__control.login-email#username
		
			//tagname#id.class
				//Ex : input#username.login-email
		        //Ex : input#username.form-control.private-form__control.login-email
		
			//tagname.class#id
				//Ex:  input.login-email#username
				//Ex : input.form-control.private-form__control.login-email#username
		
		//6. To use CSS Selector for other attributes
			//tagname[attribute='value']
			//Ex : input[placeholder='E-Mail Address']
		
		//7. To find CSS Selector when we have more attributes
			//tagname[attribute1='value'][attribute2='value'][attribute3='value']
				//Ex : input[type='text'][id='input-email'][placeholder='E-Mail Address']
		
		//8 . Without attribute value also we can write CSS Selector
				//Ex : input[type][id][placeholder]
		        //Ex : input[type][id][placeholder][id]
		
		//9. Without using tagname finding how many elements in the page having id
							//OR
			//without writing a single line of code in Java and selenium finding how many elements having ID
		
				//Ex : [id]   ---css Selector
		        //Ex : //*[@id]   --XPATH 
		
		//10. To find how many inputs are there in the page having ID
				//tagname[id]
					//Ex : input[id]         ---
		
		//11. text in CSS  -------------Not Available in CSS --Now the latest CSS version is 3 where text support is not available
			//but in CSS 1 AND CSS2 Versions text support was available
		
		//12. Contains function in CSS
			// tagname[attribute*='value']  ---where attribute contains(*) value
		       //Ex : input[name*='email']
				// Ex : //input[contains(@name,'email')]   ----XPATH
		
		//13. Contains function for one attribute and not for second attribute
			// input[placeholder*='E-Mail'][id='input-email']
		
		//14. Attribute value starts with 
				//tagname[attribute^='value']
					//Ex : input[placeholder^='E-Mail']  -----css selector
					//EX : //input[starts-with(@placeholder,'E')]   ---XPath
		
		//15. Ends With
				//tagname[attribute$='value']
				//Ex : input[placeholder$='Address']        -----CSS Selector
				// //input[ends-with(@placeholder,'Address')]   ----Now in latest browser ends-with is removed
		
		
		//16. Can we use Contains ,Starts-with and Ends-with in css selector   ---Yes we can use 
			//input[placeholder*='E-Mail'][id^='input'][class$='control']
		
		//If i want use id with #format
			//input[placeholder*='E-Mail'][class$='control']#input-email
		
		
		//17. Parent to Child Concept
			//  select#Form_getForm_Country>option ----direct child element
			//  select#Form_getForm_Country option  ----for direct and indirect child element
		
		//18. Child to parent ---backward traversing -----not available in CSS Selector
			//Child to ancestor ---Not Available
			//Preceding Sibling ---Not Available
		
		//19. following sibling   -yes available in css selector
			//label[for='input-firstname']+div     ----Immediate following sibling
			//label[for='input-firstname']~div     --All following siblings
		
		//20. Indexing concept in CSS---Yes we have
			// select.dropdown option:first-child  ----- for first child
			// select.dropdown option:last-child  -------for last child
			// select.dropdown option:nth-child(3) ----for nth child ---will give the 3rd child
		    // select.dropdown option:nth-last-child(3) -------third last option
			// select.dropdown option:nth-child(odd)      ----gives the list of elements which are odd numbers like 1,3,5,7,9.........
			// select.dropdown option:nth-child(even)    -------gives the list of elements which are even number like 2,4,6,8,10......
		    // select.dropdown option:nth-child(n+4)    ----gives the 4th element
			// select.dropdown option:nth-child(4n)   -----multiplication factor with 4 selects elements 4,8,12....
		
		
		
		//21. Not in CSS
			// input.form-control:not([name='search'])                        --The element which we want to remove
			// input.form-control:not([name='search']):not(#input-password)   ---to remove multiple matching elements
		
		
		//22. Comma in CSS  --we can check quick sanity or smoke whenever i land on page i collect all imp locators
				//we can collect multiple locatore together
			//#input-email ,.form-control, input[placeholder='Search'],#input-password   --these elements should be there in the page
			By impElement=By.cssSelector("#input-email ,.form-control, input[placeholder='Search'],#input-password");
			if(driver.findElements(impElement).size()==3)
			{
				System.out.println("Imp ele present on the page -----PASS"); 
			}
			else {
				System.out.println("Imp ele not present on the page ----FAIL");
			}
		
			             //XPath    Vs      CSS Selector
//1. Syntax --   		 Complex            Simple
//2. text() --   		 Yes				No
//3. AND    --   		 Yes				Yes
//4. OR		--   		 Yes				Yes ,Comma
//5. Forward --  		 Yes				Yes
//6. Backward -- 		 Yes				No
//7. Forward Sibling --  Yes				Yes
//8. Backward Sibling -- Yes				No
//9. Not  --			 Yes				Yes
//10. Index --			 Yes				Yes
//11. capture Group --	 Yes				No
//12. Performance --	 Good				Good
//13. Starts-with --	 Yes				Yes
//14. Contains --		 Yes				Yes
//15. ends-with --  	 No					Yes
//16. Web table --       Easy 				Limited
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
