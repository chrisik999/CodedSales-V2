package codedsales.repositories;

import codedsales.models.User;
import codedsales.utils.DBConnection;
import codedsales.utils.MySqlDBConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * User Repository:
 * Handles all database queries and communications for User.class.
 * 
 * @author Christian
 * @see User
 * @see DBConnection
 * @see MySqlDBConnection
 */
public class UserRepository {
    
    private final DBConnection dbConnection = new MySqlDBConnection();
    
    private final Map<Long, User> users = new HashMap<>();

    /**
     * 
     * @param userId 
     */
    public void deleteUser(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return Returns a map of Users
     */
    public Map<Long, User> getAllUsers() {
        return users;
    }

    /**
     * 
     * @param userId
     * @return Returns a User Object
     */
    public User getAUser(long userId) {
        return  new User();
    }

    /**
     * 
     * @param user
     * @return Returns a User Object
     */
    public User createUser(User user) {
        return user;
    }

    /**
     * 
     * @param user
     * @return Returns a User Object
     */
    public User updateUser(User user) {
        return user;
    }

    /**
     * 
     * @param username
     * @return Returns a User Object
     */
    public User getUser(String username) {
        return new User();
    }
    
}
