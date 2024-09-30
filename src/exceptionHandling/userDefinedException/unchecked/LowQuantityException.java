package exceptionHandling.userDefinedException.unchecked;

public class LowQuantityException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public LowQuantityException(String x)    //create constructor
	{
		this.message=x;
	}
	public String getMessage() {              //create get method because of String is private
		return this.message;
	}
	 

}
