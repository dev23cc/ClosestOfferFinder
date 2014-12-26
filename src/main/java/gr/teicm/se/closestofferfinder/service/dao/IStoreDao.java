/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.dao;

import gr.teicm.se.closestofferfinder.service.model.Store;
import java.util.List;

/**
 *
 * @author fil
 */
public interface IStoreDao {
    
    public Store getStoreById(int companyId);
    public List<Store> getAllStores();        
    public List<Store> getStoresByRadius( double lat,  double lon, double r);
}
