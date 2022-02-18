package com.OnlineBanking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Recipient")
public class Recipient {
	@Id
	@GeneratedValue
	@Column(name="A_NAME")
	private String a_name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE")
	private int phone;
	@Column(name="P_AC")
	private double p_ac;
	 @Column(name="S_AC")
		private double s_ac;
	 @Column(name="DESCRIPTION")
		private String description;
	public Recipient(  String u_name,String email,String description) {
		super();
		this.a_name = a_name;
		this.email = email;
		this.phone = phone;
		this.description = description;
		
	}
	
	public Recipient()
	{
		
	}
	public String getA_NAME() {
		return a_name;
	}

	public void setA_NAME(String a_name) {
		this.a_name = a_name;
	}
	public String getEMAIL() {
		return email;
	}

	public void setEMAIL(String email) {
		this.email = email;
	}
	public int getPHONE() {
		return phone;
	}

	public void setPHONE(int phone) {
		this.phone = phone;
	}

	public String getDESCRIPTION() {
		return description;
	}

	public void setDESCRIPTION(String description) {
		this.description = description;
	}
}

