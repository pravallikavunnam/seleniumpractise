package seleniumTopics;

public class SeleniumArchitecture {

	public static void main(String[] args) {
		
	//	https://www.screencast.com/t/rFFPU56nZFFG
		
		/* 1. Selenium script writing in any languages like Java,JS,PYTHON,RUBY,PHP,c#
		 * 2. We have multiple browsers in market like chrome,firefox,edge.....
		 * So , selenium can directly interact with the browser ----? No --requires one entity in between script and browser
		 *  --which are nothing but browserDrivers---means browser specific driver which are available in the form of executable file
		 * ex : for chrome chromedriver.exe file also called as Binary file or Driver
		 *      for Edge edgedriver.exe , firefox--geckodriver.exe  
		 *      
		 *  3. who will develop exe files---Now vendors [google, Microsoft,apple,Mozilla ] are developing their own browser driver
		 *  4. Upto selenium 2 all these exe files were developed by selenium team only but the problem came when chrome driver latest version comes
		 *  selenium team also need to focus on chromedriver.exe version to release
		 *  5. so major change from selenium 2 to selenium 3 is--driver responsibility taken care by respective browser company only
		 *  6. the selenium script which we wrote will be supplied to exe files ---ie chormeDriver.exe
		 *              ---and with the help of exe we open the application in required browser
		 *              
		 *  7. from selenium 3 to selenium 4 ----in Selenium 3 interaction from script to broswerdriver was happening with the help of 
		 *  http request we are sending and getting response with the help of JSON wire Protocol.
		 *  -----------Browser can understand only javascript and cannot understand java,python,ruby.....
		 *  ----so the script and browsers will interact with browser driver
		 *  ----here browser driver will get JSON API Request which sends to browser and gets response back from browser
		 *  8.JSON API(driver.click,driver.quit,findElemnet,.sendkeys methods ...these methods are called API) 
		 * ----- which are developed by SELENIUM dev team
		 *  -----selenium was not at all standard upto selenium 3
		 *  ----W3C WebDriver they release in the market ---how to interact with the browser without any exceptions
		 *  ----with sel 2 and sel 3 also we are interacting with browser but we were getting like 
		 *    ---1. script working on chrome not in firefox
		 *    ---2. sometimes click is not working
		 *    ---3. not able to use xpath properly
		 *  because we don't know how to handle this browsers properly , or how to interact..
		 *  ---we really what a common understanding between browser and the script which we are writing 
		 * ----that why they released selenium 4 with the W3C Standards
		 *  ---thats why now the browsers and the script which we are writing are following W3C Standards
		 *  ---now thats why they called instead of JSON Wire Protocol API they had moved to selenium 4 with W3C Webdriver API
		 *  
		 *  So,now the interactions with browsers is happening with the help of W3C Webdriver API
		 *  
		 *  9. All browsers in the market now are following guidelines provided by W3C Standards
		 *  
		 *  10. Browsers updated are given by vendors
		 *  
		 *  11. BrowserDrivers are also given by vendors only
		 *  
		 *  12. if any issue in Selenium script which we are writing in any language is taken care by  selenium dev team 
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 * 
		 * 
		 * 
		 */

	}

}
