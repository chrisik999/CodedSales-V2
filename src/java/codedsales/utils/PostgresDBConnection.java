package codedsales.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Postgresql Database connection
 * 
 * @author Christian
 */
public class PostgresDBConnection implements DBConnection {
    
    private static Connection db = null;

    //<editor-fold defaultstate="collapsed" desc="Database Connection">
    /**
     * 
     * @return Returns an sql connection.
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    @Override
    public  Connection connection() throws ClassNotFoundException, SQLException {
        String URL = Config.PGURL;
        String USERNAME = Config.PGUSERNAME;
        String PASSWORD = Config.PGPASSWORD;
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    //</editor-fold>
    
    public static void main(String[] args){
        
        try{
           PostgresDBConnection pDB = new PostgresDBConnection();
           db = pDB.connection();
           if(db != null) System.out.println("Connection Ok");
           else System.out.println("Connection down");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
