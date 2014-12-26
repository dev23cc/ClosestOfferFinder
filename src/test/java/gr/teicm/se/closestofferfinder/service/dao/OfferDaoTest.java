/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.dao;

import gr.teicm.se.closestofferfinder.service.model.Offer;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giannis
 */
public class OfferDaoTest {
    
    public OfferDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getOfferById method, of class OfferDao.
     */
//    @Test
//    public void testGetOfferById() {
//        System.out.println("getOfferById");
//        int offerId = 2;
//        String offerName = "λευκά τυριά";
//        OfferDao instance = new OfferDao();
//        Offer expResult = new Offer();
//        expResult.setOfferName(offerName);
//        Offer result = instance.getOfferById(offerId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    
    /**
     * Test of getOfferById method, of class OfferDao.
     */    
//    @Test
//    public void testGetOfferByIdIsZero() {
//        System.out.println("getOfferByIdIsZero");
//        int offerId = 0;
//        OfferDao instance = new OfferDao();
//        Offer expResult = null;
//        Offer result = instance.getOfferById(offerId);
//        assertEquals(expResult, result);
//    }
//    
//    /**
//     * Test of getOfferById method, of class OfferDao.
//     */
//    @Test
//    public void testGetOfferByIdDoesNotExist() {
//        System.out.println("getOfferByIdDoesNotExist");
//        int offerId = 100;
//        OfferDao instance = new OfferDao();
//        Offer expResult = null;
//        Offer result = instance.getOfferById(offerId);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getAllOffers method, of class OfferDao.
//     */
//    @Test
//    public void testGetAllOffers() {
//        System.out.println("getAllOffers");
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        Offer offer3 = new Offer();
//        Offer offer4 = new Offer();
//        Offer offer5 = new Offer();
//        offer1.setOfferName("αλλαντικά");
//        expResult.add(offer1);
//        offer2.setOfferName("λευκά τυριά");
//        expResult.add(offer2);
//        offer3.setOfferName("σοκολάτες");
//        expResult.add(offer3);
//        offer4.setOfferName("αναψηκτικά");
//        expResult.add(offer4);
//        offer5.setOfferName("απορρυπαντικά");
//        expResult.add(offer5);
//        List<Offer> result = instance.getAllOffers();
//        assertEquals(expResult.toString(), result.toString());
//        
//    }
    
    /**
     * Test of getOffersByDisc method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByDisc() {
//        System.out.println("getOffersByDisc");
//        double disc = 39;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        offer1.setOfferName("αναψηκτικά");
//        expResult.add(offer1);
//        offer2.setOfferName("απορρυπαντικά");
//        expResult.add(offer2);
//        List<Offer> result = instance.getOffersByDisc(disc);
//        assertEquals(expResult.toString(), result.toString());
//       
//    }

    /**
     * Test of getOffersByDisc method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByDiscEqual() {
//        System.out.println("getOffersByDiscEqual");
//        double disc = 30;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        Offer offer3 = new Offer();
//        offer1.setOfferName("αλλαντικά");
//        expResult.add(offer1);
//        offer2.setOfferName("αναψηκτικά");
//        expResult.add(offer2);
//        offer3.setOfferName("απορρυπαντικά");
//        expResult.add(offer3);
//        List<Offer> result = instance.getOffersByDisc(disc);
//        assertEquals(expResult.toString(), result.toString());
//    }
//    
    /**
     * Test of getOffersByDisc method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByDiscIsTooBig() {
//        System.out.println("getOffersByDiscIsTooBig");
//        double disc = 1000;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offers = new Offer();
//        offers.setOfferName("");
//        expResult.add(offers);
//        List<Offer> result = instance.getOffersByDisc(disc);
//        assertEquals(expResult.toString(), result.toString());
//       
//    }
//    
//    /**
//     * Test of getOffersByDisc method, of class OfferDao.
//     */
//    @Test
//    public void testGetOffersByDiscIsZero() {
//        System.out.println("getOffersByDiscIsZero");
//        double disc = 0;
//        OfferDao instance = new OfferDao();
//        OfferDao exp = new OfferDao();
//        List<Offer> expResult = exp.getAllOffers();
//        List<Offer> result = instance.getOffersByDisc(disc);
//        assertEquals(expResult.toString(), result.toString());
//    }
// 

    /**
     * Test of getOffersByStore method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByStore() {
//        System.out.println("getOffersByStore");
//        int storeId = 1;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        offer1.setOfferName("αλλαντικά");
//        expResult.add(offer1);
//        offer2.setOfferName("λευκά τυριά");
//        expResult.add(offer2);
//        List<Offer> result = instance.getOffersByStore(compId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    
    /**
     * Test of getOffersByStore method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByStoreIsZero(){
//        System.out.println("getOffersByStoreIsZero");
//        int compId = 0;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offers = new Offer();
//        offers.setOfferName("");
//        expResult.add(offers);
//        List<Offer> result = instance.getOffersByStore(compId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    
    /**
     * Test of getOffersByStore method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByStoreDoesNotExist(){
//        System.out.println("getOffersByStoreDoesNotExist");
//        int compId = 100;
//        OfferDao instance = new OfferDao();
//        List<Offer> expResult = new ArrayList<>();
//        Offer offers = new Offer();
//        offers.setOfferName("");
//        expResult.add(offers);
//        List<Offer> result = instance.getOffersByStore(compId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    /**
     * Test of GetOffersByExistedCategory method, of class OfferDao.
     */
//    @Test
//    public void testGetOffersByExistedCategory() {
//        System.out.println("testGetOffersByExistedCategory");
//        int catId = 1;
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        Offer offer3 = new Offer();
//        offer1.setOfferName("αλλαντικά");
//        expResult.add(offer1);
//        offer2.setOfferName("λευκά τυριά");
//        expResult.add(offer2);
//        offer3.setOfferName("σοκολάτες");
//        expResult.add(offer3);
//        List<Offer> result = instance.getOffersByCategory(catId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    
//    @Test
//    public void testGetOffersByNotExistedCategory() {
//        System.out.println("testGetOffersByNotExistedCategory");
//        int catId = 0;
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        List<Offer> result = instance.getOffersByCategory(catId);
//        assertEquals(expResult.toString(), result.toString());
//    }
    
//    @Test
//    public void testGetOffersByCategoryWithNoOffers() {
//        System.out.println("testGetOffersByCategoryWithNoOffers");
//        int catId = 4;
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        List<Offer> result = instance.getOffersByCategory(catId);
//        assertEquals(expResult.toString(), result.toString());
//    }
//
//    @Test
//    public void testGetOffersByExistedCity() {
//        System.out.println("testGetOffersByExistedCity");
//        String city = "σέρρες";
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        Offer offer2 = new Offer();
//        Offer offer3 = new Offer();
//        Offer offer4 = new Offer();
//        Offer offer5 = new Offer();
//        offer1.setOfferName("αλλαντικά");
//        expResult.add(offer1);
//        offer2.setOfferName("λευκά τυριά");
//        expResult.add(offer2);
//        offer3.setOfferName("σοκολάτες");
//        expResult.add(offer3);
//        offer4.setOfferName("αναψηκτικά");
//        expResult.add(offer4);
//        offer5.setOfferName("απορρυπαντικά");
//        expResult.add(offer5);
//        List<Offer> result = instance.getOffersByCity(city);
//        assertEquals(expResult.toString(), result.toString());
//    }
//
//    @Test
//    public void testGetOffersByNotExistedCity() {
//        System.out.println(" testGetOffersByNotExistedCity");
//        String city = "12345";
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        List<Offer> result = instance.getOffersByCity(city);
//        assertEquals(expResult.toString(), result.toString());
//    }
//    
//    @Test
//    public void testGetOffersByExistedCityWithNoOffers() {
//        System.out.println("testGetOffersByExistedCityWithNoOffers");
//        String city = "αθήνα";
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        List<Offer> result = instance.getOffersByCity(city);
//        assertEquals(expResult.toString(), result.toString());
//    }
//    
//    @Test
//    public void testGetMaxOffers() {
//        System.out.println("getMaxOffers()");
//        OfferDao instance = new OfferDao();
//        List <Offer>expResult = new ArrayList<>();
//        Offer offer1 = new Offer();
//        offer1.setOfferName("απορρυπαντικά");
//        expResult.add(offer1);
//        List<Offer> result = instance.getMaxOffers();
//        assertEquals(expResult.toString(), result.toString());
//    }
    
}
