package com.website.servlets.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserName {
	
	private String fname;
	private String lname;
	
	
	public UserName() {
		
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "UserName [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	

}
