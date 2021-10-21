package codedsales.models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User implements Serializable {
    
    //<editor-fold defaultstate="collapsed" desc="Fields">
    private long id;
    
    private String firstName;
    
    private String lastName;
    
    private String email;
    
    private String phone;
    
    private String business;
    
    private String branch;
    
    private String password;
    
    private String salt;
    
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    //Empty constructor
    public User() {
    }
    
    //New user constructor
    public User(String firstName, String lastName, String email, String phone, String business,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.business = business;
        this.password = password;
    }

    //User details constructor
    public User(long id, String firstName, String lastName, String email, String phone, String business) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.business = business;
    }

    //Find user by id
    public User(long id) {
        this.id = id;
    }

    //Find user by email
    public User(String email) {
        this.email = email;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
    
     public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String Method">
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", business=" + business + '}';
    }
    //</editor-fold>

    public void setId(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
