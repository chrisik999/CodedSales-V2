package codedsales.exceptions;

import codedsales.models.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Not Authorized Exception Mapper
 * @author Christian
 * @see NotAuthorizedException
 * @see ErrorMessage
 * @see RuntimeException
 */
@Provider
public class NotAuthorizedExceptionMapper implements ExceptionMapper<NotAuthorizedException>{
    @Override
    public Response toResponse(NotAuthorizedException exception) {
        ErrorMessage errorMessage = new ErrorMessage(401, exception.getMessage(), "http//:pornhub.com");
        return Response.status(Response.Status.UNAUTHORIZED).entity(errorMessage).build();
    }
}
