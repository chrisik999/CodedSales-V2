package codedsales.models;

import java.io.Serializable;
import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Christian
 */
@XmlRootElement
public class Expense implements Serializable{
    
    //<editor-fold defaultstate="collapsed" desc="Fields">
    private long id;
    
    private String title;
    
    private String initiator; 
    
    private String code;
    
    private double amount;
    
    private String description;
    
    private Date time;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    //No argument constructor
    public Expense() {
    }

    //Find by id constructor
    public Expense(long id) {
        this.id = id;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters And Setters">
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String Method">
    @Override
    public String toString() {
        return "Expenses{" + "id=" + id + ", title=" + title + ", code=" + code + ", amount=" + amount + ", description=" + description + ", time=" + time + '}';
    }
    //</editor-fold>

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }
    
    
}
