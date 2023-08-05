package seleniumTopics;

import java.util.Arrays;

public class StringMethods2 {

	public static void main(String[] args) {
		
		//6. ToUpperCase Method
		String ts="this is my java code";
		System.out.println(ts.toUpperCase());
		
		//7. ToLowerCase Method
		
		String ts1="THIS IS MY JAVA CODE";
		System.out.println(ts1.toLowerCase());
		
		//8.Substring Method : fetch a small string from bigger string
		String mg="your username is naveen";
		System.out.println(mg.substring(7)); //starts from given index and print the rest of the string
		System.out.println(mg.subSequence(0, 7)); //we can give range also  ---whatever char between index 0 and 7 it gives k
		//if we want to print naveen 
		System.out.println(mg.substring(mg.indexOf("is")+3,mg.length()));
		
		//9. Contains Method --it is different from substring
		String g="your username is naveen"; //checking naveen is there or not
		System.out.println(g.contains("naveen")); //
		if(g.contains("naveen")) {
			System.out.println("Pass");
		}
				
		
		//10. Equals Method
		String p1="Hello Selenium";
		String p2="Hello selenium";
		//in CSP both ref var pointing to Hello Selenium
		//for string comparison always use equals method
		System.out.println(p1.equals(p2)); //gives exact comparison ---hard comparison
		
		System.out.println(p1.equalsIgnoreCase(p2)); //soft comparison ---will ignore the cases
		
		
		//11. Split Method ---Splitting into two parts
		String lang="JAVA_PYTHON_RUBY_JAVASCRIPT";
		//Return type of Split Method is always String Array
		String lg[]=lang.split("_"); //split on the basis of underscore
		System.out.println(lg[0]);
	//	System.out.println(lg[4]); //gives ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(lg)); //to print all the values of static array
		
		
		String top="helloxXtestingXxXSeleniumXXxXAutomationxXXCypress";
		String tp[]=top.split("xX");
		//System.out.println(Arrays.toString(tp));
	//	System.out.println(tp[0].length()); //0 before xX index will be 0 which is nothing
		//If we write hello before xX then what is tp[0]
		System.out.println(tp[0]);
		System.out.println(tp[1]);//testingX
		System.out.println(tp[2]);//SeleniumXX
		System.out.println(tp[3]);//Automation
		System.out.println(tp[4]); //XCypress
	//	System.out.println(tp[5]);// ArrayIndexOutOfBoundsException:
		
		
		String mg1="your username is naveen";
		String m=mg1.split("is")[1].trim(); //gives index 1 value so storing in string which gives naveen --use trim to remove space
		System.out.println(m);
		
		
		String empData="Mitaj;Automation;Pune;India;323232;SDET;123.33";
		String emp[]=empData.split(";");
		for(String e:emp) {
			System.out.println(e);
		}
		System.out.println(emp[0]);
		
		System.out.println("--------------------------");
		
		String emp1="Sagar|Automation|Pune|India|323232|SDET|123.33";
		String emp2[]=emp1.split("\\|");
		System.out.println(emp2[0]); //we get only S ---Because have special value in regular expression
		//| --used to maintain regular expressions or to maintain in strings internally
		//we need to escape | this character --i want to instruct to java please take this as normal character 
		//and don't consider it as regular expression----so we use two backslash before pipe \\|
		
		
	//	String d1="I Love Java And I am so happy"; //Output should be I Love "Java" And I am so happy
	//	System.out.println(d1);
		//so we give "Java" java in double quote as escape character and don't consider my string ends here
		//and give \ before double quotes
		String d1="I Love \"Java\" And I am so happy";
		System.out.println(d1);
		
		
		createXpath("chinnu");

	}
	
	public static void createXpath(String empName) {
		String xpath ="//a[text()='"+empName+"']"; //this is a string --where text can be any empname ---
		//whatever parameter we are passing it should be appended like '"+X+"'
		System.out.println(xpath);

	}

}
