package codedsales.exceptions;

import codedsales.models.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException exception) {
        ErrorMessage errorMessage = new ErrorMessage(404, exception.getMessage(), "https://google.com");
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
    
}
