package eu.pms.common.exceptions;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class BusinessException extends Exception
{
    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public BusinessException(Throwable cause) {
        super(cause);
    }
}
