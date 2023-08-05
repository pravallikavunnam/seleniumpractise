package seleniumTopics;

public class MixingWait {

	public static void main(String[] args) {
		
		//When applied IW -10 sec--it is a global wait applied for all the ele
		//applied WebDriverWait-15 sec for username field
		//what if we apply both the waits at a time ---Is not a good idea---badly impacts performance of script
		//both waits have different mechanism 
		//1.first go through IW---10 sec--ele found in 2 sec--8 sec will be ignored
		//2. WDW---15 sec---ele found in 5 sec----
		
		
		
		
		
		

	}

}
