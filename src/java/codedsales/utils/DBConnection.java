package codedsales.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Database Connection Interface
 * 
 * @author Christian
 */
public interface DBConnection {
    /**
     * 
     * @return Connection
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public Connection connection() throws ClassNotFoundException, SQLException;
    
}
