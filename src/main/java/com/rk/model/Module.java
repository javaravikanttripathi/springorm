package com.rk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Module {
	@Id
	@Column(name = "mid")
	private Integer modId;
	@Column(name = "mname")
	private String modName;
	@Column(name = "mtype")
	private String modType;

	public Integer getModId() {
		return modId;
	}

	public void setModId(Integer modId) {
		this.modId = modId;
	}

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public String getModType() {
		return modType;
	}

	public void setModType(String modType) {
		this.modType = modType;
	}

	@Override
	public String toString() {
		return "Module [modId=" + modId + ", modName=" + modName + ", modType=" + modType + "]";
	}

}
