/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.model;

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
 *1
 * @author fil
 */
@Entity
@Table(name="offer")
//@Table(name="OFFER")
@XmlRootElement(name = "offer")
@XmlType(propOrder={"id",//"compId","catId",
                    "offerName","descr","disc","price"})

public class Offer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int offerId;
//    @Column(name="comp_id")
//    private int compId;
//    @Column(name="cat_id")
//    private int catId;
    @Column(name="offer_name")
    private String offerName;
    @Column(name="offer_descr")
    private String descr;
    @Column(name="discount")
    private double disc;
    @Column(name="price")
    private double price;
//    @Column (name="DISCOUNT")
//    private double discount;
    
    @XmlElement
    public int getId() {
        return offerId;
    }

    public void setId(int offerId) {
        this.offerId = offerId;
    }
    
    @XmlElement    
    public String getOfferName(){
        return offerName;
    }
    
    public void setOfferName(String offerName){
        this.offerName = offerName;
    }
    
//    @XmlElement
//    public int getCompId(){
//        return compId;
//    }
//    
//    public void setCompId(int compId){
//        this.compId = compId;
//    }
//    
//    @XmlElement
//    public int getCatId(){
//        return catId;
//    }
//    
//    public void setCatId(int catId){
//        this.catId = catId;
//    }
    
    @XmlElement
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @XmlElement
    public double getDisc(){
        return disc;
    }
    
    public void setDisc(double disc){
        this.disc = disc;
    }

    @XmlElement
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
// @XmlElement
//    public double getDiscount() {
//        return discount;
//    }
//     public void setDiscount(double discount) {
//        this.discount = discount;
//    }
    
    @Override
    public String toString(){
        return offerName;
    }
    
}
