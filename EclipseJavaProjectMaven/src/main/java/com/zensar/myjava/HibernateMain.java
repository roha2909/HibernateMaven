package com.zensar.myjava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * @author Rohini Ahirrao
 * @creation Date 1 oct 2019 10:33AM
 * @modification Date 1 oct 2019 10:33AM
 * @version 1.0
 * @copyright : Zensar Technologies . All rights reserved.
 * @description : It is Main class.
 */
public class HibernateMain {
	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Product p = new Product();
		p.setProdutId(1008);
		p.setName("nailpaint");
		p.setBrand("nykyaa");
		p.setPrice(1200f);
		
		
		s.save(p);
		t.commit();
		s.close();

	}
}
