/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.booleanworks.bomworkshop2015a.webapp;

import com.booleanworks.bomworkshop2015a.entity.oagi10.bom.v1.SyncBOMType;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.bind.JAXB;


/**
 *
 * @author vortigern
 */
public class TestDataHelper implements ServletContextListener {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.booleanworks_bomworkshop2015a_war_1.0-SNAPSHOTPU");

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Logger.getGlobal().warning("TestDataHelper.contextInitialized");
        System.out.println("TestDataHelper.contextInitialized");

        try {
            
            //URL testResUrl = this.getClass().getResource("BOMSync-Receive-DEMO20150401001-P1.xml");
            URL testResUrl = this.getClass().getResource("/test/BOMSync-Receive-DEMO20150401001-P1.xml");

            SyncBOMType testsyncBom = JAXB.unmarshal(testResUrl, SyncBOMType.class);
            
            if (testsyncBom != null) {
                Logger.getGlobal().warning("TestDataHelper.contextInitialized, got an object !!!");
                System.out.println("TestDataHelper.contextInitialized, got an object !!!");
                
                emf.createEntityManager().persist(testsyncBom);
                
            }else
            {
                Logger.getGlobal().warning("TestDataHelper.contextInitialized, NO object !!!");
                System.out.println("TestDataHelper.contextInitialized, NO object !!!");            }
                

        } catch (Exception e01) {
            Logger.getGlobal().warning("TestDataHelper.contextInitialized ERROR: " + e01.getMessage());
            System.out.println("TestDataHelper.contextInitialized ERROR: " + e01.getMessage());
            System.err.println("TestDataHelper.contextInitialized ERROR: " + e01.getMessage());
            e01.printStackTrace(System.err);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Logger.getGlobal().warning("TestDataHelper.contextDestroyed");
        System.out.println("TestDataHelper.contextDestroyed");
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
