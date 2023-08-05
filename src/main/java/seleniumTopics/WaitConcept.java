package seleniumTopics;

public class WaitConcept {

	public static void main(String[] args) {

		
		//Synchronization : 
		//wait ----there are two types of wait
		//static wait is coming from Java Library
		//1. static wait  --Thread.sleep(5000) 5 sec--Thread is class and sleep is method --it is coming from Java---
		//Case 1:it will pause script for 5 sec--what if element is found in 2 sec--then wasting 3 more
		//Case 2:we have given 10 sec --element is coming after 20 sec--after 10 sec it will proceed further and still ele is not visible
		//in both the cases not worth of using
		//thats why avoid using thread.sleep because it is static wait means just simple pause script and don't do anything for next given sec
		
		//Thread.sleep used in code like 10 sec --for 100 times --then 1000 sec
		
		//so we need dynamic wait---suppose we have given wait for 10 sec--but ele found in 2 sec--so rest 8 sec will get cancelled
		//case 2: if ele is not found in given time then throw the exception NSE
		
		//so performance wise dynamic wait is good
		
		//
		
		//2. dynamic wait --dynamic wait are provided by Selenium Library
		//app is running on browser --it is handled by specific tool---
		//selenium sends instruction to browser and app
		//may be application is slow ---some elements are not coming immediately ----so selenium may not wait for that element
		//if element is not there then throws exception 
		//so in that case we have to so a sync between app and script
		
		//In Selenium dynamic waits we have
		//1. Implicitly wait
		//2. Expilict wait  
			//1. WebDriver wait
			//2. Fluent wait 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
