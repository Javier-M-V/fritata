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
@Table(name="minerals")
public class Minerals implements Serializable{
	
	private static final long serialVersionUID = 2329441276824124356L;

	@Id
	@Column(name = "food_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CALCIUM", nullable = true , precision=10, scale=2)
	private Double calcium;
	
	@Column(name = "PHOSPHORUS", nullable = true , precision=10, scale=2)
	private Double phosphorus;
	
	@Column(name = "SODIUM", nullable = true , precision=10, scale=2)
	private Double sodium;
	
	@Column(name = "POTASSIUM", nullable = true , precision=10, scale=2)
	private Double posasium;
	
	@Column(name = "IRON", nullable = true , precision=10, scale=2)
	private Double iron;
	
	@Column(name = "ZINC", nullable = true , precision=10, scale=2)
	private Double zinc;
	
	@Column(name = "IODINE", nullable = true , precision=10, scale=2)
	private Double iodine;
	
	@Column(name = "SELENIUM", nullable = true , precision=10, scale=2)
	private Double selenium;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Food food;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Double getCalcium() {
		return calcium;
	}

	public void setCalcium(Double calcium) {
		this.calcium = calcium;
	}

	public Double getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(Double phosphorus) {
		this.phosphorus = phosphorus;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public Double getPosasium() {
		return posasium;
	}

	public void setPosasium(Double posasium) {
		this.posasium = posasium;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}

	public Double getZinc() {
		return zinc;
	}

	public void setZinc(Double zinc) {
		this.zinc = zinc;
	}

	public Double getIodine() {
		return iodine;
	}

	public void setIodine(Double iodine) {
		this.iodine = iodine;
	}

	public Double getSelenium() {
		return selenium;
	}

	public void setSelenium(Double selenium) {
		this.selenium = selenium;
	}
}
