package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addr")
public class Address {
	@Id
	@Column(name = "aid")
	private Integer addrId;
	@Column(name = "aloc")
	private String addrLoc;
	@Column(name = "apin")
	private String addrPin;

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getAddrLoc() {
		return addrLoc;
	}

	public void setAddrLoc(String addrLoc) {
		this.addrLoc = addrLoc;
	}

	public String getAddrPin() {
		return addrPin;
	}

	public void setAddrPin(String addrPin) {
		this.addrPin = addrPin;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", addrLoc=" + addrLoc + ", addrPin=" + addrPin + "]";
	}

}
