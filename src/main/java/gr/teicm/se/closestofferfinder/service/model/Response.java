/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.model;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 *
 * @author fil
 */
  
   @XmlRootElement
public class Response {
    private long id;
    private String status;
    private String message;


    public long getId() {
        return (new Date()).getTime();
    }


    @XmlAttribute
    public void setId(long id) {
        this.id = id;
    }


    public String getStatus() {
        return status;
    }


    @XmlElement
    public void setStatus(String status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }


    @XmlElement
    public void setMessage(String message) {
        this.message = message;
    }
}
    

