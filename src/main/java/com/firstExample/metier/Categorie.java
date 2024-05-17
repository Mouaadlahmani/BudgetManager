package com.firstExample.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	private String Housing;
	@Column
	private String Transportation;
	@Column
	private String Food;
	@Column
	private String Insurance;
	@Column
	private String MedicalHealthcare;
	@Column
	private String PersonalSpending;
	public Categorie() {
		super();
	}
	public Categorie(String housing, String transportation, String food, String insurance, String medicalHealthcare,
			String personalSpending) {
		super();
		Housing = housing;
		Transportation = transportation;
		Food = food;
		Insurance = insurance;
		MedicalHealthcare = medicalHealthcare;
		PersonalSpending = personalSpending;
	}
	public String getHousing() {
		return Housing;
	}
	public void setHousing(String housing) {
		Housing = housing;
	}
	public String getTransportation() {
		return Transportation;
	}
	public void setTransportation(String transportation) {
		Transportation = transportation;
	}
	public String getFood() {
		return Food;
	}
	public void setFood(String food) {
		Food = food;
	}
	public String getInsurance() {
		return Insurance;
	}
	public void setInsurance(String insurance) {
		Insurance = insurance;
	}
	public String getMedicalHealthcare() {
		return MedicalHealthcare;
	}
	public void setMedicalHealthcare(String medicalHealthcare) {
		MedicalHealthcare = medicalHealthcare;
	}
	public String getPersonalSpending() {
		return PersonalSpending;
	}
	public void setPersonalSpending(String personalSpending) {
		PersonalSpending = personalSpending;
	}
	
}
