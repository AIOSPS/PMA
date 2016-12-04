
package eu.pms.common.exceptions;

public class ApplicationException extends Exception {
	public ApplicationException() {
		super();
	}

	public ApplicationException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public ApplicationException(Throwable cause) {
		super(cause);
	}

}