package codedsales.services;

//<editor-fold defaultstate="collapsed" desc="Imports">
import codedsales.models.Business;
import codedsales.repositories.BusinessRepository;
import java.util.ArrayList;
import java.util.List;
//</editor-fold>

/**
 * Handles all Operations pertaining the Business.
 * @author Christian
 * @see Business
 * @see BusinessRepository
 */
public class BusinessService {
    
    private final BusinessRepository businessRepo = new BusinessRepository();
    
    //<editor-fold defaultstate="collapsed" desc="Get Businesses">
    /**
     * 
     * @return Returns a list of Business Objects.
     */
    public List<Business> getBusinesses(){
        return new ArrayList<>(businessRepo.getBusinesses().values());
    }
    //</editor-fold>
    
    
    /**
     * 
     * @param country
     * @param state
     * @return Returns a list of Business Objects.
     */
    public List<Business> getBusinesses(int limit, int offset) {
        return new ArrayList<>(businessRepo.getBusinesses(limit, offset).values());
    }
    
    /**
     * 
     * @param businessId
     * @return Returns a Business Object.
     */
    public Business getBusiness(long businessId){
        return businessRepo.getBusiness(businessId);
    }
    
    /**
     * 
     * @param business
     * @return Returns a Business Object.
     */
    public Business createBusiness(Business business){
        return businessRepo.createBusiness(business);
    }
    
    /**
     * 
     * @param business
     * @return Returns a Business Object.
     */
    public Business updateBusiness(Business business){
        return businessRepo.updateBusiness(business);
    }
    
    /**
     * 
     * @param businessId
     * @return 
     */
    public String deleteBusiness(long businessId){
        return businessRepo.deleteBusiness(businessId);
    }
    
}
