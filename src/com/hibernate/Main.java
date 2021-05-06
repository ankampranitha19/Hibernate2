package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration c = new Configuration();
        c.configure("configure.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session se = sf.openSession();
        Bank x = new Bank();
        x.setId(2);
        x.setName("pranitha");
        x.setPassword("pranitha");
        x.setRe_password("pranitha");
        x.setEmail("a@123.com");
        x.setPhone("1234556");
        x.setAddress("Dilsuknagar");

        Transaction tx = se.beginTransaction();
        se.save(x);
        tx.commit();
        se.close();
        sf.close();

    }
}