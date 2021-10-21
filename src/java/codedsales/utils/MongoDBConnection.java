package codedsales.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Christian
 */
public class MongoDBConnection implements DBConnection{

    @Override
    public Connection connection() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
