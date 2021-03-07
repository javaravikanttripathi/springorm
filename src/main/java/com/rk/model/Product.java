package com.rk.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prod")
public class Product {
	@Id
	@Column(name = "pid")
	private Integer prodId;
	@Column(name = "pname")
	private String prodName;
	@Column(name = "pcost")
	private double prodCost;
	@OneToMany()
	@JoinColumn(name = "fk")
	private Set<Module> prodMod = new HashSet<Module>();

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdCost() {
		return prodCost;
	}

	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}

	public Set<Module> getProdMod() {
		return prodMod;
	}

	public void setProdMod(Set<Module> prodMod) {
		this.prodMod = prodMod;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", prodMod="
				+ prodMod + "]";
	}

}
