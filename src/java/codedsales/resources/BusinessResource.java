package codedsales.resources;

//<editor-fold defaultstate="collapsed" desc="Imports">
import codedsales.models.Business;
import codedsales.services.BusinessService;
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
import codedsales.annotations.JwtAuthentication;
import codedsales.annotations.BusinessAuth;
//</editor-fold>

/**
 * Handles all HTTP connections pertaining the Business
 * @author Christian
 * @see Business
 * @see BusinessService
 * @see Http 
 */ 
@Path("businesses")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class BusinessResource {

    private final BusinessService businessService = new BusinessService();
    
    @Context
    private UriInfo context;
    
    //<editor-fold defaultstate="collapsed" desc="Path Params">
    @PathParam("{businessId}")
    private long businessId;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Query Params">
    
    @QueryParam("limit")
    private int limit;
    
    @QueryParam("offset")
    private int offset;
    //</editor-fold>

    public BusinessResource() {
    }
    
    //<editor-fold defaultstate="collapsed" desc="Business">
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get all Businesses">
    @GET
    public List<Business>  getAllBusinesses() {
        if(limit > 0 || offset > 0) return businessService.getBusinesses(limit, offset);
//       return businessService.getBusinesses();
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get a Business">
    @GET
    @Path("{businessId}")
    public Business getBusiness() {
        return businessService.getBusiness(businessId);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create aBusiness">
    @POST
    public Business createBusiness(Business business) {
        return businessService.createBusiness(business);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Update a Business">
    @PUT
    @Path("{businessId}")
    public Business updateBusiness(Business business) {
        return businessService.updateBusiness(business);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Delete a Business">
    @DELETE
    @Path("{businessId}")
    public void deleteBusiness() {
        businessService.deleteBusiness(businessId);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Branches">
    @Path("{businessId}/branches")
    public BranchResource branches(){
        return new BranchResource();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="StockActivities">
    @Path("{businesId}/stockactivity")
    public StockActivityResource stockActivities(){
        return new StockActivityResource();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Items">
    @Path("{businessId}/items")
    public ItemResource items(){
        return new ItemResource();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Expenses">
    @Path("{businessId}/expenses")
    public ExpenseResource expenses(){
        return new ExpenseResource();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sales">
    @Path("{businessId}/sales")
    public SaleResource sales(){
        return new SaleResource();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Credits">
    @Path("{businessId}/credits")
    public CreditResource credits(){
        return new CreditResource();
    }
    //</editor-fold>
    
}
