package com.hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HIberAPI {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		ShowRoom sh = new ShowRoom();
		sh.setShid(101);
		sh.setShname("Wakad");

		Car c = new Car();
		c.setCid(1);
		c.setCcolor("red");
		c.setCname("MAHINDRA THAR");
		
		c.setShid(102);
		c.setShname("Nigadi");

		Bike b = new Bike();
		b.setWheels(2);
		b.setName("Yamaha R15");
		
		b.setShid(103);
		b.setShname("pimpri");
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(sh);
		s.save(c);
		s.save(b);
		tx.commit();
		s.close();
		factory.close();

	}

}
