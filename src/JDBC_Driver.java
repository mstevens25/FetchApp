import java.sql.*;

/**
 *
 * @author Matt
 */
public class JDBC_Driver {
    
    public static void main(String[] args) {
        
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fetchdb", "root", "mysqlpw");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
