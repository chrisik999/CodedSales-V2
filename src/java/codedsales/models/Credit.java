package codedsales.models;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Christian
 */
@XmlRootElement
public class Credit implements Serializable{
    
    private long id;
    
    private String customerName;
    
    private String customerPhone;
    
    private String code;
    
    private String Sale;
    
    private long mainDebt;
    
    private long paid;
    
    private long amount;
    
    private Date createdDate;

    public Credit() {
    }

    public Credit(long id, String customerName, String customerPhone, String code, String Sale, long mainDebt, long paid, long amount, Date createdDate) {
        this.id = id;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.code = code;
        this.Sale = Sale;
        this.mainDebt = mainDebt;
        this.paid = paid;
        this.amount = amount;
        this.createdDate = createdDate;
    }

    public Credit(String customerName, String customerPhone, String code, String Sale, long mainDebt, long paid) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.code = code;
        this.Sale = Sale;
        this.mainDebt = mainDebt;
        this.paid = paid;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSale() {
        return Sale;
    }

    public void setSale(String Sale) {
        this.Sale = Sale;
    }

    public long getMainDebt() {
        return mainDebt;
    }

    public void setMainDebt(long mainDebt) {
        this.mainDebt = mainDebt;
    }

    public long getPaid() {
        return paid;
    }

    public void setPaid(long paid) {
        this.paid = paid;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Credit{id=").append(id);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerPhone=").append(customerPhone);
        sb.append(", code=").append(code);
        sb.append(", Sale=").append(Sale);
        sb.append(", mainDebt=").append(mainDebt);
        sb.append(", paid=").append(paid);
        sb.append(", amount=").append(amount);
        sb.append(", createdDate=").append(createdDate);
        sb.append('}');
        return sb.toString();
    }
    
}
