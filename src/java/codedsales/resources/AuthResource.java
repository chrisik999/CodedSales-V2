package codedsales.resources;

import codedsales.services.AuthService;
import codedsales.services.UserService;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.SignatureException;
import java.util.logging.Level;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * 
 * @author Christian
 * @see UserService
 */
@Path("/auth")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class AuthResource {
    
     @Context
    private UriInfo context;
     
     private AuthService authService = new AuthService();

    @Path("login")
    @POST
    public Response loginUser(@FormParam("username") String username, @FormParam("password") String password){
        try {
            
            String token = authService.AuthenticateUser(username, password);
            java.util.logging.Logger.getLogger(AuthResource.class.getName()).log(Level.INFO, "valid string token found{0}", token);
            return Response.ok("Verified Successfully").build();
        } catch(ExpiredJwtException | MalformedJwtException | UnsupportedJwtException | SignatureException | IllegalArgumentException e){
            java.util.logging.Logger.getLogger(AuthResource.class.getName()).log(Level.INFO, "Exception ", e.getMessage());
            return Response.status(500).build();
        }
    }
}


