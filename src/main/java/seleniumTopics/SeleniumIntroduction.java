package seleniumTopics;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		// https://www.screencast.com/t/vwG2sqMz
	}
}
/*Selenium Notes
 * 1. Selenium is an automation library or automation tool which perform some actions on the browser and automates browser.
 * 2. Selenium is not for the testing purpose ie..,with selenium i cannot test anything 
 * 3. Selenium will perform some actions on browser like finding specific elements(checkboxes,links,radio buttons,images..)
 * 4. Selenium will i
 * nteract with browser
 * 5. selenium cannot verify pricing information on the web page
 * 
 * 	1.Primarily Selenium is for automating web applications for testing purposes, but is certainly not limited to just that.
	2.Boring web-based administration tasks can (and should) also be automated as well--like
 * example 1 : 1000 entries in my excel which need to be dumped in the web form---manually takes time so with selenium we can automate 
 * example 2:  To fetch 1000 product pricing info and description from an e-commerce site --web scraping 
 * example 3:  In a Web page form an Admin page to be filled with 10 user-which will take time manually-- 
 *             we can automate the form with selenium with specific data
 *             
 *  Pros of selenium
 *  1. Selenium is free and open-source tool
 *     Open-source--we can see source code of selenium and we can customize it 
 *                  if not able to see source code like ecilpse,webdriver io ----
 *     Free-means free tool which is free no need to purchase any licenses
 *     . Every free tool is not open source
 *  2. Selenium supports all major browsers like chrome,firefox,safari,Edge,Opera
 *  3. Selenium supports various programming languages like Java,Python,ruby,JS,PhP,Go language,C#,.Net  
 * 	4. Selenium supports running test scripts on different platforms/OS--Windows ,Mac,Linux  (Unix is not supported)
 *  5. W3C Webdriver protocol ---W3C are the standards for the browsers/ for the web application
 *  -----if web application is not following W3C standards then application is not upto to the mark
 *  ---Selenium webdriver is W3C Certified ---advantage---selenium code is written in W3C
 *  ----All browsers in the market are following W3C guidelines and policies
 *  ----Selenium is also following W3C guidelines and policies
 *  -----Web application which are we using are also following W3C guidelines and policies
 *  6. Community Support -----we get a solution in any language whenever we are struck
 *  7. Selenium Family ---to learn Appium for mobile testing --because appium is using selenium internally
 *              ----Webdriver IO supports JS----but internally using selenium webdriver
 *              ----Selenide---automation library--which uses selenium internally and customize selenium as per req
 *              -----Protractor(Depricated)---it was popular with JS---which used selenium internally
 *              
 *              
 *   Cons of Selenium
 *   1.Selenium supports only Web Application automation not for mobile,desktop,api
 *           ----doen't automate Mobile App,Native App,Hybrid App,Desktop Automation
 *     ---but we can automate mobile web browser
 *     
 *   2. Not a testing tool-Cannot generate any reports like how many tc pass/fail where we need to use external tools like TestNG Report,Allure Report,HTML Report
 *   3. Test data Management---cannot maintain any test data
 *   3. Cannot automate different technologies---Hardware Testing like bluetoth devices,IOT
 *   4. Cannot automate OTP's , Barcodes,  Captchas ,QR Codes
 *   5. Cannot Interact with Gmail , Email,Outlook ,Yahoo and fetching OTP's --selenium can go to gmail 
 *   6. Selenium cannot do performance testing
 *   7. Selenium cannot do security testing
 *   8. Cannot automate PDF's , Word Documents ,Excel 
 *   9. Cannot do Accessibility testing alone with selenium---we can do using third part tool
 *   10. Parallel execution with selenium not possible---using TestNG we can do it
 *   11. Cannot do Image testing --we can check image is there or not but we cannot check the text or content on the Image
 *   
 *   Components of selenium
 *   There are 4 components of selenium
 *   1. Selenium IDE--Which is a record and play plugin on chrome and firefox---released on 2008
 *   2. Selenium RC(Remote Control)-which also called as Selenium 1---which is deprecated from market from past 6 or 7 years--released on 2011
 *   3. Selenium Webdriver---Webdriver was a tool which integarted with RC ---so it called as selenium webdriver--which is selenium 2 ---
 *   after selenium 2---Selenium 3 got released----selenium 4 got released which is absolutely W3C Certified
 *   4. Selenium Grid---We can create Hub and Nodes---if we want to run test cases on Remote machine or AWS Machine or may be on cloud machine or in differnet serever
 *   ie..with the help of parallel testing using TestNG
 *   
 *   
 *  
 * 
 * 
 * 
 * 
 * 
 */


