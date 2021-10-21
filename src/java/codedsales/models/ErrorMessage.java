package codedsales.models;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage implements Serializable{
    
    private int status;
    
    private String message;
    
    private String documentation;

    public ErrorMessage(int status, String message, String documentation) {
        this.status = status;
        this.message = message;
        this.documentation = documentation;
    }

    public ErrorMessage() {
    }
    
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" + "status=" + status + ", message=" + message + ", documentation=" + documentation + '}';
    }
    
    
}
