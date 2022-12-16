package com.hibernate.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
//@DiscriminatorColumn(name ="Show",discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("sh")
public class ShowRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int shid;
	String shname;

	public int getShid() {
		return shid;
	}

	public void setShid(int shid) {
		this.shid = shid;
	}

	public String getShname() {
		return shname;
	}

	public void setShname(String shname) {
		this.shname = shname;
	}

	@Override
	public String toString() {
		return "ShowRoom [shid=" + shid + ", shname=" + shname + "]";
	}

}
