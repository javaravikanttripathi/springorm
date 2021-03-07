package com.rk.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	@Column(name = "sid")
	private Integer stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "smarks")
	private double stdMarks;
	@ManyToMany
	@JoinTable(name = "stdcrstab", joinColumns = @JoinColumn(name = "sdtfk"), inverseJoinColumns = @JoinColumn(name = "crsfk"))
	private Set<Course> stdCrsObj = new HashSet<Course>();

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}

	public Set<Course> getStdCrsObj() {
		return stdCrsObj;
	}

	public void setStdCrsObj(Set<Course> stdCrsObj) {
		this.stdCrsObj = stdCrsObj;
	}

	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdName=" + stdName + ", stdMarks=" + stdMarks + ", stdCrsObj="
				+ stdCrsObj + "]";
	}

}
