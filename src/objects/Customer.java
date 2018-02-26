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
                   state,
                   zip;
    private char middleInitial;
    
    public Customer(int customerID, String email, String pass, String phone, String firstName, char middleInitial,
                    String lastName, String addressLine1, String addressLine2, String city, String state, String zip) {
        this.customerID = customerID;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
               
    public int getcustomerID() { return customerID; }
    public String getemail() { return email; }
    public String getpass() { return pass; }
    public String getphone() { return phone; }
    public String getfirstName() { return firstName; }
    public char getmiddleInitial() { return middleInitial; }
    public String getlastName() { return lastName; }
    public String getaddressLine1() { return addressLine1; }
    public String getaddressLine2() { return addressLine2; }
    public String getcity() { return city; }
    public String getstate() { return state; }
    public String getzip() { return zip; }
    
    public void setcustomerID(int customerID) {  this.customerID = customerID; }
    public void setemail(String email) { this.email = email; }
    public void setpass(String pass) { this.pass = pass; }
    public void setphone(String phone) { this.phone = phone; }
    public void setfirstName(String firstName) { this.firstName = firstName; }
    public void setmiddleInitial(char middleInitial) { this.middleInitial = middleInitial; }
    public void setlastName(String lastName) { this.lastName = lastName; }
    public void setaddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }
    public void setaddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }
    public void setcity(String city) { this.city = city; }
    public void setstate(String state) { this.state = state; }
    public void setzip(String zip) { this.zip = zip; }
    
}
    
    
    
    

