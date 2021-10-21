package codedsales.resources;

import codedsales.models.User;
import codedsales.services.UserService;
import java.util.List;
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

/**
 * REST Web Service for User
 * Handles all HTTP communications pertaining the User.
 *
 * @author Christian
 * @see UserService
 * @see User
 */

@Path("users")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class UserResource {

    @Context
    private UriInfo context;
    
    @QueryParam("username")
    private String username;
    
    @PathParam("{userId}")
    private long userId;
    
    private UserService userService = new UserService();

    public UserResource() {
    }

    @GET
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
//    @GET
//    public User getUser(){
//        return userService.getUser(username);
//    }
    
    @GET
    @Path("{userId}")
    public User getAUser() {
        return userService.getAUser(userId);
    }
    
    @POST
    public User createUser(User user){
        return userService.createUser(user);
    }

    @PUT
    @Path("userId")
    public User updateUser(User user) {
        user.setId(userId);
        return userService.updateUser(user);
    }
    
    @DELETE
    @Path("userId")
    public void deleteUser(){
        userService.deleteUser(userId);
    }
    
    @Path("{userId}/profiles")
    public ProfileResource profiles(){
        return new ProfileResource();
    }
    
}
