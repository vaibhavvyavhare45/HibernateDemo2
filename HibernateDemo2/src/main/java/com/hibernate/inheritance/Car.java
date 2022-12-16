package com.hibernate.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("ca")
public class Car extends ShowRoom {

	int cid;
	String cname;
	String ccolor;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcolor() {
		return ccolor;
	}

	public void setCcolor(String ccolor) {
		this.ccolor = ccolor;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", ccolor=" + ccolor + "]";
	}
	
	

}
