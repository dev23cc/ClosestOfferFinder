/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.dao;

import gr.teicm.se.closestofferfinder.service.model.Offer;
import java.util.List;

/**
 *
 * @author Giannis
 */
public interface IOfferDao {
    public Offer getOfferById(int offerId);
    public List<Offer> getAllOffers();
    public List<Offer> getOffersByDisc(double disc);
 //   public List<Offer> getOffersByStore(int compId);
//    public List<Offer> getOffersByCategory(int catId);
    public List<Offer> getOffersByCity(String city);
    public List<Offer> getMaxOffers();
}
