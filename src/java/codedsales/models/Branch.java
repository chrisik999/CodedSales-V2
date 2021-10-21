package codedsales.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Branch implements Serializable{
    
    private long id;
    
    private String title;
    
    private String business;
    
    private String manager;
    
    private String phone;
    
    private String address;
    
    private List<User> staffs = new ArrayList<>();

    public Branch(long id, String title, String business, String manager, String phone, String address) {
        this.id = id;
        this.title = title;
        this.business = business;
        this.manager = manager;
        this.phone = phone;
        this.address = address;
    }

    public Branch() {
    }

    public Branch(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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

    @XmlTransient
    public List<User> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<User> staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
        return "Branch{" + "id=" + id + ", title=" + title + ", business=" + business + ", manager=" + manager + ", phone=" + phone + ", address=" + address + ", staffs=" + staffs + '}';
    }
    
}
