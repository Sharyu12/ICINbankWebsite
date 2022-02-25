package com.OnlineBanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chequebook")
public class Chequebook {

	@Id
	@GeneratedValue
	@Column(name="s_no")
	private int s_no;
	@Column(name="u_name")
	private String u_name;
	@Column(name="a_type")
	private String a_type;
	@Column(name="description")
	private String description;
	
	
	
	public Chequebook()
	{
		
	}



	public int getS_no() {
		return s_no;
	}



	public void setS_no(int s_no) {
		this.s_no = s_no;
	}



	public String getU_name() {
		return u_name;
	}



	public void setU_name(String u_name) {
		this.u_name = u_name;
	}



	public String getA_type() {
		return a_type;
	}



	public void setA_type(String a_type) {
		this.a_type = a_type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Chequebook(int s_no, String u_name, String a_type, String description) {
		super();
		this.s_no = s_no;
		this.u_name = u_name;
		this.a_type = a_type;
		this.description = description;
	}

	




}

