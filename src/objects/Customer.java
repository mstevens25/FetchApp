/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author mattm
 */
public class Customer {
    
    private int customerID;
    private String email,
                   pass,
                   phone,
                   firstName,
                   lastName,
                   addressLine1,
                   addressLine2,
                   city,
                   zip;
    private char state,
                 middleInitial;
    
    public Customer(int customerID, String email, String pass, String phone, String firstName, Char middleInitial,
                    String lastName, String addressLine1, String addressLine2, String city, Char state, String zip) {
        this.customerID = customerID;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = 
        
    }
                
    
    
}
