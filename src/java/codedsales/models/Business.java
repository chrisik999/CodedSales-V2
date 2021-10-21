package codedsales.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Business implements Serializable{
    
    private long id;
    
    private String name;
    
    private String businessCode;
    
    private String email;
    
    private String phone;
    
    private String address;
    
    private String host;
    
    private String country;
    
    private String state;
    
    private List<Branch> branches = new ArrayList<>();
    
    private List<User> staffs = new ArrayList<>();
    
    private Map<Long, StockActivity> stockActivities= new HashMap<>();
    
    private Map<Long, Item> items = new HashMap<>();
    
    private Map<Long, Expense> expenses = new HashMap<>();
    
    private Map<Long, Sale> sales = new HashMap<>();

    public Business(String name, String email, String phone, String address, String host) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.host = host;
    }

    public Business(long id) {
        this.id = id;
    }
    
    public Business(){
        
    }

    public Business(String phone) {
        this.phone = phone;
    }

    public Business(long id, String name, String email, String phone, String address, String host) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.host = host;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @XmlTransient
    public List<User> getStaffs() {
        return staffs;
    }
    
    public void setStaffs(List<User> staffs) {
        this.staffs = staffs;
    }
    
    @XmlTransient
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        return "Business{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", host=" + host + '}';
    } 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }
    
    @XmlTransient
    public Map<Long, StockActivity> getStockActivities() {
        return stockActivities;
    }

    public void setStockActivities(Map<Long, StockActivity> stockActivities) {
        this.stockActivities = stockActivities;
    }

    @XmlTransient
    public Map<Long, Item> getItems() {
        return items;
    }

    public void setItems(Map<Long, Item> items) {
        this.items = items;
    }

    @XmlTransient
    public Map<Long, Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(Map<Long, Expense> expenses) {
        this.expenses = expenses;
    }

    @XmlTransient
    public Map<Long, Sale> getSales() {
        return sales;
    }

    public void setSales(Map<Long, Sale> sales) {
        this.sales = sales;
    }
    
}
