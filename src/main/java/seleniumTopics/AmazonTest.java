package seleniumTopics;

public class AmazonTest {//here not required extend keyword ie AmazonTest extends BrowserUtil---extend means inheritance--parent and child relationship
						//Amazontest is a caller class which has a main method---it is a kind of user class

	public static void main(String[] args) {
		
		String browserName="Chrome";
		BrowserUtil brUtil=new BrowserUtil(); //creating an object of BrowserUtil class
	
		//	brUtil.driver=new ChromeDriver();  //with br reference variable trying to access driver reference and creating object----Not required
		//  brUtil.driver.get("https://www.amazon.com");
		
		brUtil.launchBrowser(browserName); //calling the launchBrowser method 
		brUtil.enterURL("https://www.amazon.com");
		String actTitle=brUtil.getPageTitle();
		System.out.println(actTitle);
		if(actTitle.contains("Amazon")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
		}
		
		String actURL=brUtil.getCurrentURL();
		System.out.println(actURL);
		if(actURL.contains("amazon")) {
			System.out.println("Correct URL");
		}else
		{
			System.out.println("Incorrect URL");
		}
		
		brUtil.quitBrowser();
		
		
	}

}
