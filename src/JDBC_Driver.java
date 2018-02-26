import java.sql.*;

/**
 *
 * @author Matt
 */
public class JDBC_Driver {
    
      String dbURL = "jdbc:mysql://localhost:3306/fetchdb";
      String dbUser = "root";
      String dbPassword = "mysqlpw";   
    
    public JDBC_Driver(Customer addCustomer) {
        
        try {
            Connection myConnection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            
            PreparedStatement myStmt = myConnection.prepareStatement("insert into Customer"
                +    " (email, pass, phone, firstName, middleInitial, lastName, addressLine1, addressLine2, city, state, zip)"
                +    " values (?,?,?,?,?,?,?,?,?,?,?)");
            
            myStmt.setString(0, addCustomer.getemail());
            myStmt.setString(1, addCustomer.getpass());
            myStmt.setString(2, addCustomer.getphone());
            myStmt.setString(3, addCustomer.getfirstName());
            myStmt.setString(4, addCustomer.getmiddleInitial());
            myStmt.setString(5, addCustomer.getlastName());
            myStmt.setString(6, addCustomer.getaddressLine1());
            myStmt.setString(7, addCustomer.getaddressLine2());
            myStmt.setString(8, addCustomer.getcity());
            myStmt.setString(9, addCustomer.getstate());
            myStmt.setString(10, addCustomer.getzip());
            
   
            myStmt.executeQuery();

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    }
}
