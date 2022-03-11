package com.fritata.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food implements Serializable{

	private static final long serialVersionUID = -5259991042560575715L;

	@Id
	@Column(name = "food_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "FOOD_NAME", nullable = false, unique=true, length=128)
	private String foodName;
	
	@Column(name = "ENERGY", nullable = true , precision=10, scale=2)
	private Double energy;

	@OneToOne(mappedBy = "food", cascade=CascadeType.ALL)
	private Macrotrient macro;
	
	@OneToOne(mappedBy = "food", cascade=CascadeType.ALL)
	private Minerals minerals;
	
	@OneToOne(mappedBy = "food", cascade=CascadeType.ALL)
	private Vitamins vitamins;
	
	@OneToOne(mappedBy = "food", cascade=CascadeType.ALL)
	private OtherNutrient otherNutrient;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getEnergy() {
		return energy;
	}
	

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public Macrotrient getMacro() {
		return macro;
	}

	public void setMacro(Macrotrient macro) {
		this.macro = macro;
	}

	public Minerals getMinerals() {
		return minerals;
	}

	public void setMinerals(Minerals minerals) {
		this.minerals = minerals;
	}

	public Vitamins getVitamins() {
		return vitamins;
	}

	public void setVitamins(Vitamins vitamins) {
		this.vitamins = vitamins;
	}

	public OtherNutrient getOtherNutrient() {
		return otherNutrient;
	}

	public void setOtherNutrient(OtherNutrient otherNutrient) {
		this.otherNutrient = otherNutrient;
	}
}
