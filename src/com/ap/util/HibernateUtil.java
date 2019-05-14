package com.ap.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf=null;
	
	static {
		sf=new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getsf() {
		return sf;
	}
}
