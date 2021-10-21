package codedsales.resources;

import codedsales.models.Branch;
import codedsales.services.BranchService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import codedsales.annotations.JwtAuthentication;
import codedsales.annotations.BusinessAuth;

/**
 *
 * @author Christian
 */
@Path("/branches")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class BranchResource {
    
    private final BranchService branchService = new BranchService();
    
    @Context
    private UriInfo context;
    
    @PathParam("{branchId}")
    private long branchId;
    
    @PathParam("{businessId}")
    private long businessId;

    public BranchResource() {
    }

    @GET
    public List<Branch>  getAllBranches() {
        return branchService.getBranches(businessId);
    }
    
    @GET
    @Path("{branchId}")
    public Branch getBranch() {
        return branchService.getBranch(branchId, businessId);
    }
    
    @POST
    public Branch createBranch(Branch branch) {
        return BranchService.createBranch(branch, businessId);
    }

    @PUT
    @Path("{branchId}")
    public Branch updateBranch(Branch branch) {
        branch.setId(branchId);
        return BranchService.updateBranch(branch, businessId);
    }
    
    @DELETE
    @Path("{branchId}")
    public void deleteBranch() {
        branchService.deleteBranch(branchId, businessId);
    }
    
}
