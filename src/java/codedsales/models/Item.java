package codedsales.models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item implements Serializable {
    
    //<editor-fold defaultstate="collapsed" desc="Fields">
    private long id;
    
    private String name;
    
    private String code;
    
    private double price;
    
    private String description;
    
    private String business;
    
    private double quantity;
    
    private double amount;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    //Create a new item constructor
    public Item(String name, String code, double price, String business, String description) {
        this.name = name;
        this.price = price;
        this.business = business;
        this.code = code;
        this.description = description;
    }

    //Empty Constructor
    public Item() {
    }

    //
    public Item(String code) {
        this.code = code;
    }
    
    public Item(String code, String business) {
        this.code = code;
        this.business = business;
    }
    
    //Item details from db constructors
    public Item(long id, String name, String code, double price, String business, String description) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.price = price;
        this.business = business;
        this.description = description;
    }
    
    //Item constructor for sales
    public Item(String code, double price, String business, double quantity, double amount) {
        this.quantity = quantity;
        this.price = price;
        this.business = business;
        this.code = code;
        this.amount = amount;
    }
    
    //Find item by id
    public Item(long id) {
        this.id = id;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
    
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = getQuantity() * getPrice();
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String Method">
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", price=" + price + ", business=" + business + '}';
    }
    //</editor-fold>

}
