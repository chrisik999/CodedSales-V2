package codedsales.resources;

import codedsales.models.Item;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import codedsales.annotations.JwtAuthentication;
import codedsales.annotations.BusinessAuth;

@Path("/items")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ItemResource {
    
    
    @QueryParam("")
    private String queryParam;
    
    @PathParam("{userId}")
    private long userId;
    
    @GET
    public List<Item> getItems(){
        throw new UnsupportedOperationException("method not implemented");
    }
    
    @GET
    @Path("itemId")
    public Item getItem(){
        throw new UnsupportedOperationException("method not implemented");
    }
    
    @POST
    public Item createItem(){
        throw new UnsupportedOperationException("method not implemented");
    }
    
    @PUT
    @Path("itemId")
    public Item updateItem(){
        throw new UnsupportedOperationException("method not implemented");
    }
    
    @DELETE
    @Path("itemId")
    public Item deleteItem(){
        throw new UnsupportedOperationException("method not implemented");
    }
    
}
