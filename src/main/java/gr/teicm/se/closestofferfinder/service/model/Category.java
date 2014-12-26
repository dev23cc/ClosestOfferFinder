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
 *
 * @author Giannis
 */
@Entity
@Table(name="category")
@XmlRootElement(name = "category")
@XmlType(propOrder={"id","catName"})

public class Category {   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int categoryId;
    @Column(name="cat_name")
    private String catName;
    
    @XmlElement
    public int getCatId(){
        return categoryId;
    }
    
    public void setCatId(int categoryId){
        this.categoryId = categoryId;
    }
    
    @XmlElement
    public String getCatName(){
        return catName;
    }
    
    public void setCatName(String catName){
        this.catName = catName;
    }

}
