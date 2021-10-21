package codedsales.resources;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import codedsales.annotations.JwtAuthentication;

@Path("profiles")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ProfileResource {

    @Context
    private UriInfo context;
    
    
    @QueryParam("")
    private String queryParam;
    
    @PathParam("{profileId}")
    private long profileId;

    public ProfileResource() {
    }

    @GET
    public String getAllProfies() {
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    @GET
    @Path("profileId")
    public String getProfile() {
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    @POST
    public String createProfile(){
        throw new UnsupportedOperationException("Method not implemented");
    }

    @PUT
    @Path("profileId")
    public void updateUser() {
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    @DELETE
    @Path("profileId")
    public void deleteProfile (){
        throw new UnsupportedOperationException("Method not implemented");
    }
    
}
