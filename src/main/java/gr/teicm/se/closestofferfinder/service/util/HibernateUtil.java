/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author fil
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = getSessionFactory();
    private static ServiceRegistry serviceRegistry;

    public static SessionFactory getSessionFactory() {

        Configuration configuration = new Configuration();
        configuration.configure();

        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        return sessionFactory;

    }
}
