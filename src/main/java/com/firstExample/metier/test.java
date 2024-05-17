package com.firstExample.metier;

import java.sql.Date;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.firstExample.hibernate.config.HibernateUtil;

public class test {
	public static void main(String[] args) {
		SessionFactory Factory = HibernateUtil.getSessionFactory();
		
		/*
		 * Transactions transaction = new Transactions(); Date date = new
		 * Date(24,11,2023); transaction.setMontant(200); transaction.setDate(date);
		 * transaction.setCategorie("Electronic");
		 * transaction.setDescription("tkhaaarbii9");
		 */
		 
		/*
		 * Budgets budgets = new Budgets(); budgets.setCategorie("Tahada");
		 * budgets.setLimit(149.99);
		 */
		
		Categorie categorie = new Categorie();
		categorie.setFood("Food");
		categorie.setHousing("Housing");
		categorie.setInsurance("Insurance");
		categorie.setMedicalHealthcare("Medical And Healthcare");
		categorie.setPersonalSpending("Personal Spending");
		categorie.setTransportation("Transportation");
		Session session = Factory.openSession();
		
		Transaction ts = session.beginTransaction();
		session.save(categorie);
		
		ts.commit();
		
		session.close();
		
		
		}
}
