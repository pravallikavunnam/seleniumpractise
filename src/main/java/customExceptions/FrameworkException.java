package customExceptions;

public class FrameworkException extends RuntimeException{


	//we create a constructor of the class
	//so whenever we create object of FrameworkException this constructor will be called along with messgae
	public FrameworkException(String mesg) {
		super(mesg);
	}

	
}
