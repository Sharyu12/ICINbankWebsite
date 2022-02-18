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
@Table(name="Chequebook")
public class Chequebook {

	@Id
	@GeneratedValue
	
	
	@Column(name="U_NAME")
	private String u_name;
	@Column(name="A_TYPE")
	private String a_type;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	public Chequebook( String u_name,String a_type ,String description) {
		super();
		this.u_name = u_name;
		this.a_type = a_type;
		this.description = description;
		
	}
	
	public Chequebook()
	{
		
	}
	public String getU_NAME() {
		return u_name;
	}

	public void setU_NAME(String u_name) {
		this.u_name = u_name;
	}
	 public String getA_TYPE() {
			return a_type;
		}

		public void setA_TYPE(String email) {
			this.a_type = a_type;
		}
	
	public String getDESCRIPTION() {
		return description;
	}

	public void setDESCRIPTION(String designation) {
		this.description = description;
	}


}

