package codedsales.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Christian
 */
public class MySqlDBConnection implements DBConnection {
    
    private static Connection db = null;
    
    /**
     * 
     * @return Returns an sql connection.
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    //<editor-fold defaultstate="collapsed" desc="Mysql Database Connection">
    @Override
    public Connection connection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/codedsales?useSSL=false&serverTimezone=Africa/Lagos";
        String USERNAME = "root";
        String PASSWORD = "Mysql5250";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    //</editor-fold>
    
    public static void main(String[] args){
        
        try{
           MySqlDBConnection mDB = new MySqlDBConnection();
           db = mDB.connection();
           if(db != null) System.out.println("Connection Ok");
           else System.out.println("Connection down");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
