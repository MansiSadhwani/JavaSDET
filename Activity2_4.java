/* customException class*/

package Activity2_4;

public class customException extends Exception

{
	private String message;

	public customException(String message)
	{
		this.message = message;
	}
	
	public String getMessage() 
	{
	    return message;
	}
}

/* Main Exception class*/

package Activity2_4;

public class MainException {
	
		public static void main(String[] args) 
	{ try
	{
		
		MainException.exceptionTest("Exception Test method with a string message\n");
		MainException.exceptionTest(null);
	}
	catch(customException msg)
	{
		System.out.println("Inside catch block \n" +msg);
	}
	}

	private static void exceptionTest(String message) throws customException 
	
	{
			if(message == null)
			throw new customException("Exception Test method with null string ");
			else
			System.out.println(message);
			
	}

}
