/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.dao;

import gr.teicm.se.closestofferfinder.service.model.Store;
import gr.teicm.se.closestofferfinder.service.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author fil
 */
public class StoreDao implements IStoreDao{
    
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       
   @Override
    public Store getStoreById(int storeId) {
        Store store = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            store = (Store)session.createQuery("from  Store c where c.storeId=:id").setParameter("id",storeId).uniqueResult();
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

        return store;

    }
    
    //returns all Companies
    @Override
     public List<Store> getAllStores() {
        List<Store> stores = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            stores = session.createQuery("from Store c order by c.storeName").list();
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
        return stores;
        
 
        
        

    }
     

    @Override
     public List<Store> getStoresByRadius( double lat,  double lon, double r) {
        List<Store> stores = null;
        Session session = null;
        try {
           // double dist =r/111; 
            session = sessionFactory.openSession();
            session.beginTransaction();
            String hgl="from Store c where (pow((c.latitude-:lat),2) +  pow((c.longitude-:lon),2))<pow((:r),2)";
            stores= session.createQuery(hgl)
                    .setParameter("lon", lon)
                    .setParameter("lat", lat)
                    .setParameter("r", r/111)
                    .list();
            //         
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
        return stores;
  
}
}