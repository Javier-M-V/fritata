package com.fritata.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="macro")
public class Macrotrient implements Serializable {
	
	private static final long serialVersionUID = -2714340110359606314L;

	@Id
	@Column(name = "food_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CARBO", nullable = true , precision=10, scale=2)
	private Double carbo;
	
	@Column(name = "FAT", nullable = true , precision=10, scale=2)
	private Double fat;
	
	@Column(name = "PROTEIN", nullable = true , precision=10, scale=2)
	private Double protein;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Food food;
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Double getCarbo() {
		return carbo;
	}

	public void setCarbo(Double carbo) {
		this.carbo = carbo;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}
}
