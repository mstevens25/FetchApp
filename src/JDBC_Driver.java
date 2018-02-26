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
    Customer addCustomer;
    
        
        try {
    
            Connection myConnection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
                    
            PreparedStatement myStmt = myConnection.prepareStatement("insert into customer"
                +    " (email, pass, phone, firstName, middleInitial, lastName, addressLine1, addressLine2, city, state, zip)"
                +    " values (?,?,?,?,?,?,?,?,?,?,?)");
            
            myStmt.setString(1, addCustomer.getemail());
            myStmt.setString(2, addCustomer.getpass());
            myStmt.setString(3, addCustomer.getphone());
            myStmt.setString(4, addCustomer.getfirstName());
            myStmt.setString(5, addCustomer.getmiddleInitial());
            myStmt.setString(6, addCustomer.getlastName());
            myStmt.setString(7, addCustomer.getaddressLine1());
            myStmt.setString(8, addCustomer.getaddressLine2());
            myStmt.setString(9, addCustomer.getcity());
            myStmt.setString(10, addCustomer.getstate());
            myStmt.setString(11, addCustomer.getzip());
            
   
            myStmt.executeQuery();
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
             
    }     
        
    }

