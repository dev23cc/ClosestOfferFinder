package gr.teicm.se.closestofferfinder.service.dao;

import gr.teicm.se.closestofferfinder.service.model.Offer;
import gr.teicm.se.closestofferfinder.service.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author fil
 */
public class OfferDao implements IOfferDao {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    //returns the offer with the given Id
    @Override
    public Offer getOfferById(int offerId) {
        Offer offer = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offer = (Offer)session.createQuery("from  Offer offer where offer.offerId=:id").setParameter("id",offerId).uniqueResult();
            session.getTransaction().commit();

        } catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }

        return offer;

    }
    
    //returns all the offers
    @Override
     public List<Offer> getAllOffers() {
        List<Offer> offers = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offers = session.createQuery("from Offer offer order by offer.offerId").list();
            session.getTransaction().commit();

        } catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return offers;

    }
     //Returns all the offers that have a discount equal or bigger with the one given
    @Override
    public List<Offer> getOffersByDisc(double disc){
        List<Offer> offers = null;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offers = session.createQuery("from Offer offer where offer.disc >= :discount order by offer.offerId").setParameter("discount", disc).list();
            session.getTransaction().commit();
        }
        catch (Exception ex) {
            if (session !=null){
                session.getTransaction().rollback();
            }            
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
        
        return offers;
    }
    
    //Returns all the offers of a given store
//    @Override
//    public List<Offer> getOffersByStore(int compId){
//        List<Offer> offers = null;
//        Session session = null;
//        
//        try {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            offers = session.createQuery("from Offer offer where offer.compId = :comp_id order by offer.offerId").setParameter("comp_id", compId).list();
//            session.getTransaction().commit();
//        }
//        catch (Exception ex) {
//            if (session !=null){
//                session.getTransaction().rollback();
//            }            
//        }
//        finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        
//        return offers;
//    }
//    
//    //Returns all the offers of a given category
//    @Override
//    public List<Offer> getOffersByCategory(int catId){
//        List<Offer> offers = null;
//        Session session = null;
//        
//        try {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            offers = session.createQuery("from Offer offer where offer.catId = :cat_id order by offer.offerId").setParameter("cat_id", catId).list();
//            session.getTransaction().commit();
//        }
//        catch (Exception ex) {
//            if (session !=null){
//                session.getTransaction().rollback();
//            }            
//        }
//        finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        
//        return offers;
//    }
    
    //Returns all the offers that exist in a given city
    @Override
    public List<Offer> getOffersByCity(String city){
        List<Offer> offers = null;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offers = session.createQuery("from Offer offer where offer.storeId in  (select store.storeId from Store store where store.city = :city)").setParameter("city", city).list();
            session.getTransaction().commit();
        }
        catch (Exception ex) {
            if (session !=null){
                session.getTransaction().rollback();
            }            
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
        
        return offers;
    }
    
    @Override
    public List<Offer> getMaxOffers() {
        List<Offer> offers = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            String hql2 = "FROM Offer p WHERE p.disc = (SELECT max(a.disc) FROM Offer a)";
            offers = session.createQuery(hql2).list();
            session.getTransaction().commit();

        } catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return offers;
    }
  
      
}
