
package eu.pms.common.exceptions;

import eu.pms.common.constant.ExceptionType;

//Application import files



public class ComponentException extends ApplicationException {

	/**
	 * Default Constructor
	 * @param
		 */
//    Added By Ibrahim Assi Date :24/3/2012

    private int    exceptionType;
    private String exceptionLocation;

    public int getExceptionType() {
        return exceptionType;
    }
    public String getExceptionTypeTxt() {
        return ExceptionType.toString(exceptionType);
    }

    public void setExceptionType(int exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getExceptionLocation() {
        return exceptionLocation;
    }

    public void setExceptionLocation(String exceptionLocation) {
        this.exceptionLocation = exceptionLocation;
    }

    public ComponentException(int exceptionType,String exceptionLocation,String message)
    {
		super(message);
        this.exceptionLocation=exceptionLocation;
        this.exceptionType=exceptionType;
	}
    public String toString()
    {
        String txt= ExceptionType.toString(exceptionType)+"  in  "+exceptionLocation+"  details : "+super.getMessage();
        return txt;
    }
//   End Added By Ibrahim Assi Date :24/3/2012

	public ComponentException() {
		super();
	}

	/**
	 * Constructor. Creates a ComponentException object with a message
	 * @param message the exception message
     */

	public ComponentException(String message) {
		super(message);
	}

	/**
	 * Constructor. Creates a ComponentException object with a single message and a nested exception
	 * @param message the exception message
	 * @param cause java.lang.Throwable, presumably an exception you've already caught
     */

	public ComponentException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor. Creates a ComponentException object with a nested exception
	 * @param cause java.lang.Throwable, presumably an exception you've already caught
     */

	public ComponentException(Throwable cause) {
		super(cause);
	}


}