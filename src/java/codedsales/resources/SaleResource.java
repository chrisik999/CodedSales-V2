package codedsales.resources;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import codedsales.annotations.JwtAuthentication;
import codedsales.annotations.BusinessAuth;

/**
 * REST Web Service
 *
 * @author Christian
 */ 
@Path("sales")
public class SaleResource {

    @Context
    private UriInfo context;

    public SaleResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        throw new UnsupportedOperationException("method not implemented");
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
        throw new UnsupportedOperationException("method not implemented");
    }
}
