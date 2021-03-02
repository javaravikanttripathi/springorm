package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@OneToOne
	@JoinColumn(name = "afk", unique = true)
	private Address empAddr;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(Address empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + "]";
	}

}
