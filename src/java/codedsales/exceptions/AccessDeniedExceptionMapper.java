package codedsales.exceptions;

import codedsales.models.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Christian
 */
@Provider
public class AccessDeniedExceptionMapper implements ExceptionMapper<AccessDeniedException> {

    @Override
    public Response toResponse(AccessDeniedException exception) {
        ErrorMessage errorMessage = new ErrorMessage(400, exception.getMessage(), "https//pornhub.com");
        return Response.status(Response.Status.FORBIDDEN).entity(errorMessage).build();
    }
    
}
