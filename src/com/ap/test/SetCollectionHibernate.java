package com.ap.test;

 
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ap.model.PaymentInfo;
import com.ap.util.HibernateUtil;

public class SetCollectionHibernate {
	
	public static void main(String[] args) {
		
		Transaction tx=null;
		try(Session ses=HibernateUtil.getsf().openSession())
		{
			tx=ses.beginTransaction();
			
			 //create object & set Information
			PaymentInfo pob=new PaymentInfo();
			pob.setPmtId(88);
			pob.setPmtMode("CASH");
			pob.getPoffers().add("CB50");
			pob.getPoffers().add("NEWS88");
			pob.getPoffers().add("GETHLF");
			System.out.println();
			
              //  Operation perform
			ses.save(pob);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println( " operation done..");
		}
		
		}
	}

