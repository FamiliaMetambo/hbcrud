/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbnet;

import modelo.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Makhene
 */
public class Hbnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.close();
    }
    
}
