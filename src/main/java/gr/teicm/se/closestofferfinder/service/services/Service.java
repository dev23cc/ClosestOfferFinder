
package gr.teicm.se.closestofferfinder.service.services;

import gr.teicm.se.closestofferfinder.service.dao.OfferDao;
import gr.teicm.se.closestofferfinder.service.dao.StoreDao;
import gr.teicm.se.closestofferfinder.service.model.Store;
import gr.teicm.se.closestofferfinder.service.model.Offer;
import static java.lang.Math.abs;
import java.util.ArrayList;
//import java.ua til.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author fil
 */
@Path("service")
public class Service {

    private OfferDao offerDao=new OfferDao();
    private StoreDao storeDao=new StoreDao();

    @GET
    @Path("/getOfferByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Offer getOfferByIdJSON(@PathParam("id") int offerId) {
             
        return offerDao.getOfferById(offerId);
    }

    @GET
    @Path("/getAllOffersJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getAllOffersJSON() {
        return offerDao.getAllOffers();
    }
      
    @GET
    @Path("/getOffersByDiscJSON/{disc}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getOffersByDiscJSON(@PathParam("disc") double disc){
        return offerDao.getOffersByDisc(disc);
    }
    @GET
    @Path("/getTestOffer")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getTestOffer(){
        List <Offer> dump = new ArrayList<>();
        String str="";
        Offer myoffer = new Offer();
        if(offerDao.getAllOffers()!=null) {
        dump = offerDao.getAllOffers();
        
        if (dump.get(1).getOfferName()==null) str="null";
        else str=dump.get(1).getOfferName();
        }
        myoffer.setId(255);
        myoffer.setOfferName("MyCustomOffer");
        myoffer.setDescr("Inexpensive custom offer " + str);
        myoffer.setDisc(90);
        myoffer.setPrice(50);
        List <Offer> offer= new ArrayList<>();
        offer.add(myoffer);        
        return (offer);
    }
//    @GET
//    @Path("/getOffersByStoreJSON/{compId}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Offer> getOffersByStoreJSON(@PathParam("compId") int compId){
//        return offerDao.getOffersByStore(compId);
//    }
//    
//    @GET
//    @Path("/getOffersByCategoryJSON/{catId}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Offer> getOffersByCategoryJSON(@PathParam("catId") int catId){
//        return offerDao.getOffersByCategory(catId);
//    }
      
    @GET
    @Path("/getOffersByCityJSON/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getOffersByCityJSON(@PathParam("city") String city){
        return offerDao.getOffersByCity(city);
    }
    

    
        //This method return all offers in JSON format
    @GET
    @Path("/getMaxDisqOffersJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getMaxDisqOffersJSON() {
       // return new ArrayList<Offer>(offers.values());
        return offerDao.getMaxOffers();
    }
            //This method return all offers in JSON format
    @GET
    @Path("/getVersionWsJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public String getVersionWsJSON() {
        String ver_WS="ver 0.2";
        return ver_WS;
    }
    
          //This method returns company by ID in JSON format
    @GET
    @Path("/getStoreByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Store getStoreByIdJSON(@PathParam("id") String sstoreId) throws Exception { 
        Store store=null;
        try{
        int storeId=Integer.parseInt(sstoreId);
        store= storeDao.getStoreById(storeId);
        }
         catch (NumberFormatException nfe){
             
         throw new NumberFormatException("Wrong parameter or character in id");
         }
        catch (Exception ex){

        }
        if (store==null) 
            throw new Exception("Store not exist");
        return store;
        
    } 
      //This method returns all companies in JSON format
    @GET
    @Path("/getAllStoresJSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Store> getAllStoresJSON() {
    return storeDao.getAllStores();
    }   
      //This method returns all companies closer to radius (r) in JSON format  
     //with parameter user latitude and longitude (GPS)
    @GET
    @Path("/getStoresByRadiusJSON/{lat},{lon},{r}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Store> getStoresByRadiusJSON(@PathParam("lat") double lat, @PathParam("lon") double lon, @PathParam("r") double r)
            throws Exception {
      //  List<Store> stores = new ArrayList<>();
        if (abs(lat) > 180 || abs(lon)>180) {
            throw new Exception("Incorrect coordinate pair");
        } else if (r <= 0) {
            throw new Exception("Incorrect radius");
        }
        //stores = stores;
        return storeDao.getStoresByRadius(lat, lon, r);
    }
//------------------
    
   
//--------
}
