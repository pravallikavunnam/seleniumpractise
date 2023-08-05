package seleniumTopics;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		
		
		// ExplicitWait : There are two types of EW,-----EW is a concept 
		//1. WebdriverWait
		//2. Fluent Wait
		
		//We have a class WebDriverWait extends one class FluentWait Class
		//FW Class has one parent interface --Wait Interface
		//In Wait Interface we have one method Until() without method body
		//FW will override the Until() method with method body and implement the method
		//It had some other methods also .....
		//WebdriverWait Class is a child of FW Class---so it can access /Inherit all the methods of FW Class
		//No Individual methods in WebDriverWait Class
		
		//what is EW?Why it is called EW?
		//1. EW is not a global wait
		//2. It will be applied for specific element 
		//un --10 sec--if element find in 3 sec it will ignore 7 sec
		//pw --0 sec  --if required we apply
		//login ---0 sec --if required we apply
		//2. EW can be applied for non-web elements ----Title ,URL ,Alert,frame 
		//Various conditions they had given ---these conditions are called as ExceptedConditions
		//ExceptedConditions is a class in selenium --we see various conditions --that on what basis we really want to apply EW
		
		//What is the difference between WebDriverWait and FluentWait?
		//WebDriverWait is child of FW ---So WebDriverWait is also a FW
		//Example :Every BMW is a car
		//In WebDriverWait we don't have any individual methods  ---access all the methods from FW
		//WebDriverWait can be applied as FW with FW features also
		//WebDriverWait is a kind of FW --inheriting the properties from FW
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
