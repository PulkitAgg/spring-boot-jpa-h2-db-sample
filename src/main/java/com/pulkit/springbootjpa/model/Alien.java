package com.pulkit.springbootjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// Create a table alien with two keys aId and aName;
@Entity
public class Alien {
	@Id
	private int aId;
	private String aName;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}

	 
	 
}
