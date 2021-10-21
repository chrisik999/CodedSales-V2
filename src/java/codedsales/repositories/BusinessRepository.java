package codedsales.repositories;

import codedsales.models.Business;
import codedsales.utils.DBConnection;
import codedsales.utils.MySqlDBConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * Handles all Queries pertaining the Business.
 * @author Christian
 * @see Business
 * @see DBConnection
 * @see MySqlDBConnection
 */
public class BusinessRepository {
    
    private DBConnection mysqlDB = new MySqlDBConnection();
    
    private Map<Long, Business> businesses = new HashMap<>();
    
    /**
     * 
     * @return Returns a Map of business
     */
    public Map<Long, Business> getBusinesses(){
        return businesses;
    }

    /**
     * 
     * @param country
     * @param state
     * @return Returns a Map of business
     */
    public Map<Long, Business> getBusinesses(int limit, int offset) {
        return businesses;
    }

    /**
     * 
     * @param businessId
     * @return Returns a Business Object.
     */
    public Business getBusiness(long businessId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param business
     * @return Returns a Business Object.
     */
    public Business createBusiness(Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param businessId
     * @return
     */
    public String deleteBusiness(long businessId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param business
     * @return Returns a Business Object.
     */
    public Business updateBusiness(Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
