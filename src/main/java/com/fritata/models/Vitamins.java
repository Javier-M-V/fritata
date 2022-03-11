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
@Table(name="vitamins")
public class Vitamins implements Serializable{
	
	private static final long serialVersionUID = -8184942633311442303L;

	@Id
	@Column(name = "food_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Vit_B1", nullable = true , precision=10, scale=2)
	private Double vitB1;
	
	@Column(name = "Vit_B2", nullable = true , precision=10, scale=2)
	private Double vitB2;
	
	@Column(name = "Vit_B3", nullable = true , precision=10, scale=2)
	private Double vitB3;
	
	@Column(name = "Vit_B6", nullable = true , precision=10, scale=2)
	private Double vitB6;
	
	@Column(name = "Vit_B12", nullable = true , precision=10, scale=2)
	private Double vitB12;
	
	@Column(name = "Vit_A", nullable = true , precision=10, scale=2)
	private Double vitA;
	
	@Column(name = "Vit_C", nullable = true , precision=10, scale=2)
	private Double vitC;
	
	@Column(name = "Vit_E", nullable = true , precision=10, scale=2)
	private Double vitE;
	
	@Column(name = "Vit_D3", nullable = true , precision=10, scale=2)
	private Double vitD3;
	
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

	public Double getVitB1() {
		return vitB1;
	}

	public void setVitB1(Double vitB1) {
		this.vitB1 = vitB1;
	}

	public Double getVitB2() {
		return vitB2;
	}

	public void setVitB2(Double vitB2) {
		this.vitB2 = vitB2;
	}

	public Double getVitB3() {
		return vitB3;
	}

	public void setVitB3(Double vitB3) {
		this.vitB3 = vitB3;
	}

	public Double getVitB6() {
		return vitB6;
	}

	public void setVitB6(Double vitB6) {
		this.vitB6 = vitB6;
	}

	public Double getVitB12() {
		return vitB12;
	}

	public void setVitB12(Double vitB12) {
		this.vitB12 = vitB12;
	}

	public Double getVitA() {
		return vitA;
	}

	public void setVitA(Double vitA) {
		this.vitA = vitA;
	}

	public Double getVitC() {
		return vitC;
	}

	public void setVitC(Double vitC) {
		this.vitC = vitC;
	}

	public Double getVitE() {
		return vitE;
	}

	public void setVitE(Double vitE) {
		this.vitE = vitE;
	}

	public Double getVitD3() {
		return vitD3;
	}

	public void setVitD3(Double vitD3) {
		this.vitD3 = vitD3;
	}
}
