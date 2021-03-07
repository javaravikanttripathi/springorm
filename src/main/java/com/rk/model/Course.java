package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Course {
	@Id
	@Column(name = "cid")
	private Integer crsId;
	@Column(name = "cname")
	private String crsName;
	@Column(name = "ccost")
	private double crsCost;

	public Integer getCrsId() {
		return crsId;
	}

	public void setCrsId(Integer crsId) {
		this.crsId = crsId;
	}

	public String getCrsName() {
		return crsName;
	}

	public void setCrsName(String crsName) {
		this.crsName = crsName;
	}

	public double getCrsCost() {
		return crsCost;
	}

	public void setCrsCost(double crsCost) {
		this.crsCost = crsCost;
	}

	@Override
	public String toString() {
		return "Course [crsId=" + crsId + ", crsName=" + crsName + ", crsCost=" + crsCost + "]";
	}

}
