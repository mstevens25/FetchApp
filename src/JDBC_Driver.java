import java.sql.*;

/**
 *
 * @author Matt
 */
public class JDBC_Driver {
    
    public static void main(String[] args) {
        
        String dbURL = "jdbc:mysql://localhost:3306/fetchdb";
        String dbUser = "root";
        String dbPassword = "mysqlpw";
        
        
        try {
            Connection myConnection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            Statement myStmt = myConnection.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from customer");
            while (myRs.next()){
                System.out.println(myRs.getString("firstName") + " " + myRs.getString("lastName"));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
