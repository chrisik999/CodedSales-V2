/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codedsales.models;

import java.io.Serializable;
import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Christian
 */
@XmlRootElement
public class StockActivity implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc="Fields">
    private long id;
    
    private String user;
    
    private String item;
    
    private String business;
    
    private String quantity;
    
    private String type;
    
    private Date date;
    
    //private long quantity;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public StockActivity(long id, String user, String item, String business, String type, Date date) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.business = business;
        this.type = type;
        this.date = date;
    }

    public StockActivity(String user, String item, String business, String type) {
        this.user = user;
        this.item = item;
        this.business = business;
        this.type = type;
    }
    
    public StockActivity() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public long getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }
    
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String Method">
    
    //</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StockActivity{id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", item=").append(item);
        sb.append(", business=").append(business);
        sb.append(", quantity=").append(quantity);
        sb.append(", type=").append(type);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
    
}
