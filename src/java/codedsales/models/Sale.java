package codedsales.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Sale implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc="Fields">
    private long id;
    
    private double total;
    
    private String business;
    
    private String initiator;
    
    private short discount;
    
    private String branch;
    
    private double amount;
    
    private String description;
    
    private String code;
    
    private Timestamp date;
    
    private List<Item> items = new ArrayList<>();
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    //new Sale constructor
    public Sale(double total, String business, String initiator, short discount, double amount, String description, String code) {
        this.total = total;
        this.business = business;
        this.initiator = initiator;
        this.discount = discount;
        this.amount = amount;
        this.description = description;
        this.code = code;
    }

    public Sale(double total, String business, String initiator, short discount, double amount, String description, String code, Timestamp date) {
        this.total = total;
        this.business = business;
        this.initiator = initiator;
        this.discount = discount;
        this.amount = amount;
        this.description = description;
        this.code = code;
        this.date = date;
    }
    
    
    
    //Sales details from database constructor
    public Sale(long id, double total, String business, String initiator, short discount, double amount, String description, String code, Timestamp date) {
        this.id = id;
        this.total = total;
        this.business = business;
        this.initiator = initiator;
        this.discount = discount;
        this.amount = amount;
        this.description = description;
        this.code = code;
        this.date = date;
    }

    //Find Sale by sale code constructor
    public Sale(long id) {
        this.id = id;
    }
    
    //Find Sale by initiator constructor
    public Sale(String initiator) {
        this.initiator = initiator;
    }
    
    //Empty sale constructor
    public Sale() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public long getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public short getDiscount() {
        return discount;
    }

    public void setDiscount(short discount) {
        this.discount = discount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    @XmlTransient
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
    
    //</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sale{id=").append(id);
        sb.append(", total=").append(total);
        sb.append(", business=").append(business);
        sb.append(", initiator=").append(initiator);
        sb.append(", discount=").append(discount);
        sb.append(", branch=").append(branch);
        sb.append(", amount=").append(amount);
        sb.append(", description=").append(description);
        sb.append(", code=").append(code);
        sb.append(", date=").append(date);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }

    
   
}
