/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.myoffers.ws.wsoffer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Giannis
 */

@Entity
@Table(name="COMPANY")
@XmlRootElement(name = "company")
@XmlType(propOrder={"companyId","compName","displayName","address","city","latitude","longitude"})

public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int companyId;
    @Column(name="comp_name")
    private String compName;
    @Column(name="display_name")
    private String displayName;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column (name="latitude")
    private Double latitude;
    @Column (name="longitude")
    private Double longitude;    
    
    @XmlElement
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    
    @XmlElement
    public String getCompName(){
        return compName;
    }
    
    public void setCompName(String compName){
        this.compName = compName;
    }
    
    @XmlElement
    public String getDisplayName(){
        return displayName;
    }
    
    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }
    
    @XmlElement
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    @XmlElement
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    @XmlElement
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    @XmlElement
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
    @Override
    public String toString(){
        return compName;
    }
    
}


