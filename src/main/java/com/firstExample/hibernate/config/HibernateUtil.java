package com.firstExample.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.firstExample.metier.Budgets;
import com.firstExample.metier.Categorie;
import com.firstExample.metier.Transactions;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		  
		  if(sessionFactory == null) { 
		  Configuration configuration = new Configuration();
		  Properties properties = new Properties();
		  properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		  properties.put(Environment.URL,"jdbc:mysql://localhost:3306/BudgetManager");
		  properties.put(Environment.USER,"root");
		  properties.put(Environment.PASS,"admin");
		  properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
		  properties.put(Environment.HBM2DDL_AUTO,"update");
		  properties.put(Environment.SHOW_SQL,true);
		  
		  configuration.setProperties(properties);
		  configuration.addAnnotatedClass(Transactions.class);
		  configuration.setProperties(properties);
		  configuration.addAnnotatedClass(Budgets.class);
		  configuration.setProperties(properties);
		  configuration.addAnnotatedClass(Categorie.class);
		  ServiceRegistry serviceRegistry = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
		  .build();
		  
		  sessionFactory=configuration.buildSessionFactory(serviceRegistry); }
		  
		  
		  
		  return sessionFactory; 
		  }
}
