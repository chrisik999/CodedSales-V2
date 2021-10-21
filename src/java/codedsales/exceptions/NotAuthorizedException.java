package codedsales.exceptions;

/**
 * Not Authorized Exception
 * @author Christian
 */
public class NotAuthorizedException extends RuntimeException{
    
    public NotAuthorizedException(String message){
        super(message);
    }
    
}
