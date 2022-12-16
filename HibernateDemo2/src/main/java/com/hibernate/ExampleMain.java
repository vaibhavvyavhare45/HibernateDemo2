package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExampleMain {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Vaibhav");
		
		PartTimeEmployee pe=new PartTimeEmployee();
		pe.setName("pranav");
		pe.setHourlyRate(450);
		
		PartTimeEmployee pe1=new PartTimeEmployee();
		pe1.setName("vishwajit");
		pe1.setHourlyRate(300);
		
		FullTimeEmployee fe=new FullTimeEmployee();	
		fe.setName("marish");
		fe.setSalary(45500);
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(e);
		s.save(pe);
		s.save(pe1);
		s.save(fe);
		tx.commit();
		s.close();
		factory.close();
		
	}

}
