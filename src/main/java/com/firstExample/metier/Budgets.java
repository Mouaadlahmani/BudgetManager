package com.firstExample.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Budgets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBudget;
	private double limit;
	private String categorie;
	public Budgets() {
		super();
	}
	public Budgets(int idBudget, double limit, String categorie) {
		super();
		this.idBudget = idBudget;
		this.limit = limit;
		this.categorie = categorie;
	}
	public int getIdBudget() {
		return idBudget;
	}
	public void setIdBudget(int idBudget) {
		this.idBudget = idBudget;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}
