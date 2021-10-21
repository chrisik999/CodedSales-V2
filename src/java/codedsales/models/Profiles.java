package codedsales.models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profiles implements Serializable {
    
    private long id;
    
    private String user;
    
    private String pic;
    
}
