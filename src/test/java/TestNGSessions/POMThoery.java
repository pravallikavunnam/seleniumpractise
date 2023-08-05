package TestNGSessions;

public class POMThoery {  //In which directory maven stores all the jar files ==> is .m2 directory .means hidden folder 
	/*
	 * POM --Page Object Model 
	 * POM is not a framework
	 * POM is a design pattern
	 * it says if you have an mobile/web Application with multiple pages 
	 * for each and every page class we have to create a java class
	 * In those page classes we have to declare two things
	 * 1. Layout of the page ----means how many locators for that particular page
	 * 2. Maintain some page actions/Page Methods --means behaviour of the page  like 
	 * 			1. what is the responsibility of the login page
	 * 			2. what are the diff functionalities available on the login page like title,url, login,forgot password ,reset password
	 * Major advantage is maintenance and generic form of framework
	 * maintenance is the key in framework part ---if we want later to add more test cases,debug the code,update the code,delete the code
	 * ,new person contributing to framework quickly ----so productivity should be higher without any confusion in the framework
	 * 
	 * 1.PAGE LAYER: where page classes are available            Page class : LoginPage.java
	 * --we should never write Assertions in page classes 
	 * ----We should write By locators and page actions in page classes
	 * 
	 * 2.TEST LAYER : Test cases will written inside test layer   Test Class : LoginPageTest.java
	 * Test should not contains any selenium library
 	 * 
	 * which framework to write the test cases we use testNG 
	 * 
	 * to design test cases for class Loginpagetest.java ----
	 * ---here we write @Test and assertion without assertion then @test will be just only test steps
	 * 
	 * likewise page wise/feature wise/functionality wise we can create n number of test classes
	 * 
	 * this test classes are integrated with page classes where LoginPageTest class will call the method defined in page class LoginPage 
	 * 
	 * this LoginPageTest will supply username,password and do login
	 * then LoginPage will login and return the welcome page after login
	 * 
	 * the return from page class will be asserted by Test class , Test class will do Assertion/Validate
	 * 
	 * page class will return the bahaviour of page to Test class as Page class cannot take decision it is correct or not
	 * 
	 * test class will decide with the help of TesTNG
	 * 
	 * 3. Base Test layer: here we write SetUp and DearTown methods and any duplicate /common preconditions will define here
	 * 
	 * We Use Inheritance using extends keyword:LoginPageTest will extends the BaseTest  ---we can inherit SetUp and TearDown Methods
	 * 
	 * 4. Driver Factory :
	 *  Who will initialize driver or where can we write cross browser logic---for that we create seperate DriverFactory Class
	 * --here we initialize the driver on the basis of driver we give
	 * 
	 * 5. CONFIG PROPERTIES : driver details we are going to maintain in config.properties file 
	 * config.properties file  is my configuration data
	 * so we are going to use two types of file
	 *  1. config.properties ---here we maintain browser details,headless,url ,un,pw ,highlight ele those details we define  
	 *               ---with the help config.properties file we are going to maintain our environments like QA,STAGE,DEV
	 *  2. TestRunner --
	 * 
	 * 6.UTILITY :  where we write Utilities and libraries
	 * the most important utility in selenium is 
	 * ElementUtil --where we create 
	 * JavaScript Util
	 * Excel util
	 * Error Class
	 * Constant Class
	 * 
	 * 7. Test Data: We have to use datadriven testing as well
	 *  who will give feature of datadriver testing : datadriven means deriving data from other source
	 * 
	 * we are going to maintain data from excel file in the form of rows and columns 
	 * Java,Selenium and TestNG cannot read data from excel for that we have to use third party tool
	 *	Apache POI which will  to read the data from Excel 
	 *  The return type of method used to read data form excel will 2D Array
	 *  the method in Util class will be called by DataProvider in test class and we do mapping between @Test and @DataProvider
	 * after @Test pick the data from @DataProvider ,
	 * @DataProvider will call the excel utility method in utility class 
	 * this excel utility method will interact with excel sheet and get the data in the form 2D array and return the data to @DataProvider
	 * where @DataProvider will return data to @Test method 
	 * @Test will call page class 
	 * 
	 * 8. Reports/Logs : We need some good reports to check the result 
	 *  we use concept TestNG Listeners for reports
	 *  1. Allure Report
	 *  2. ExtentReport v5.x latest one 
	 *  
	 *  By default TestNg will give two HTML reports 
	 *  1. Index.html
	 *  2. emailable.html
	 * 
	 * We are going to generate some Logs using Log4J API 
	 * 
	 * If any test gets failed we generate screenshots also
	 * if any failure is there screenshot will be attached to allure report/extent report
	 * 
	 * 9. Test Runners : to run test cases in a bundle/all together for that we have to create runners
	 * 
	 * these runners we are going to create  in the form of xml --right click on runner--run as TestNg--
	 * then testNg will run all the  test cases together and publish the report
	 * 
	 * 10. This is maven project because
	 * --- it gives POM.xml file 
	 * ----all the dependencies management will be handled by maven
	 * ----plugins also in maven like complier plugin,Assemble plugin for FATJAR, surefire plugin,Deployement plugin ,JAR plugin
	 *---Maven life cycle
	 *---Maven will give proper fold structure and then maven will take care of dependencies
	 * we just need to add those dependencies in pom.xml
	 *
	 * this entire process is HIGH LEVEL DESIGN----designing framework is done
	 * 
	 * LOW LEVEL DESIGN : Where we define each and every small thing like using which method 
	 * we can explain element util.java
	 * 
	 * Once test cases are executed from runner browser will be launched in our local system which is called local execution
	 * 
	 * suppose 5 people are working on different pages ---here we have to merge the code of everyone---so we need to use service is GITHUB
	 * 
	 * While merging the code we get some conflicts ---
	 * 
	 * Jenkins will take the code form GITHUB Repository and JENKINS will create our CI/CD PIPELINE and Jobs 
	 * 
	 * we create environments where we can launch the browser instead on launching the local machine
	 * 
	 * Jenkins will generate its own reports 
	 * 
	 * UI Automation requires seperate environment like execution env where we have to maintain parallel execution on diff browsers with diff version
	 *
	 * In local machine we can run on single version of browser at a time --then here we get Docker
	 * 
	 * Docker says you can use tech like selenoidGrid[custom selenium grid] --with the help os selenoid grid
	 * --we can create instance of num of chrome brow with different version 
	 * and we can create our own broswer lab also 
	 * 
	 * SETUP EXECUTION ENVIRONMENT : Execution environment will happen on the cloud
	 * on the cloud how to setup own Execution environment with the help of selenium grid
	 * Selenium grid is 4th component of selenium
	 * 
	 * Running options
	 * 
	 * 1. right click on xml--how to run test cases on the cloud like AWS Machine
	 * 2. we can run from maven
	 * 3. we can run from jenkins
	 * 
	 * What is the framework we are using means? Hybrid Framework 
	 * because we are using
	 * POM Design Pattern along with 
	 * 
	 * there are no types of framework 
	 * 
	 * Framework : 
	 * 
	 * Selenium is a kind of library which is giving me num of options to interact with the browser/ele 
	 * 
	 * Selenium is  a framework because it is very much organised in the form of diff components 
	 * 
	 * selenium is not a testing framework because it is not having any testing features
	 * 
	 * TestNG is a test framework --here we have so many classes and annotations
	 * 
	 * TestNG is a testing /unit testing framework which is helping me to design test cases
	 * 
	 * 
	 * Postman is a tool
	 * 
	 * Framework means  --management of code in the form of diff components
	 * 1. segregation of code
	 * 2. following some pattern
	 * 3. designing diff components and this components are interacting to each other
	 * 	
	 * why are we using Hybrid Framework ?
	 * we are using design pattern plus other components integration we are doing
	 * so many utilities we create 
	 * so many third party libraries we use like TestNG,LOG4J,ALLURE REPORT ...
	 * Along with infrastructure
	 * 
	 * 
	 * Every Framework should maintain Single Responsibility Principle[SRP]
	 * 
	 * SRP Means ----It says whenever we design framework every class should be responsible for specific work 
	 * like login page should have only login page related 
	 * 
	 * 
	 * Cypress is a framework
	 * Playwright is a framework 
	 * 
	 * 
	 * Everything is Hydrid now--mixture of diff approaches
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
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
