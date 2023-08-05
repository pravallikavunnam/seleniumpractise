package seleniumTopics;

import customExceptions.FrameworkException;

public class StringReverseConcept {

	
	public static void main(String[] args) {
		
		//Selenium ---reverse of String --miuneleS
		//T --Reverse of T will be T only
		//te----et
		//123---321
		//null---null is not string value---null means null--we won't write in double quotes --so we cannot reverse null
		
	//	String str="selenium";
		//In String class--we don't have any reverse function because of immutability
		//otherwise we keep reversing and creating new objects in heap unnecessary
		//but in the StringBuilder and StringBuffer it is available that we can use
		
		//these are calling a function by different values ----these are test cases
		System.out.println(reverseString(" "));
		System.out.println(reverseString(""));
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("Selenium test"));
		System.out.println(reverseString("123"));
		System.out.println(reverseString("T"));
		System.out.println(reverseString(null));
		

	}
	
	public static String reverseString(String str) { //give me string we will reverse the string
		
		//how we reverse
		//Selenium --1.we find length of string
		//2. use any loop 
		//3. starts from m
		
		//1. NULL Check
		if(str==null) {
			System.out.println("NULL VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CANNOT BE NULL");
		}
		//Null check should be done always before checking the length -becuase if we check after length str will be null--which gived NPE
		
		//2. Blank check
		if(str.isBlank()) {
			System.out.println("BLANK VALUES ARE NOT ALLOWED");
			throw new FrameworkException("STRING CANNOT BE BLANK");
			
		}
		
		int len=str.length();
		System.out.println(str + " length is:"+ len );
		
		//3. len==0
		if(len==0) {
			System.out.println("str length is zero");
			//return str;
			return "str length is zero";
		//	return "-1";
		}
		
		//4. Length check len==1
	//	System.out.println(str.length());
		if(len==1) {
			return str;
		}
		
		//5. len>1
		String rev="";
		for(int i=len-1;i>=0;i--) {

			rev=rev+str.charAt(i);
			
		}
		return rev;
		
		
		
	}
	

	//testing selenium cypress----sserpyc
	//123 ---321---without using string----with formulae we have to do it
}
