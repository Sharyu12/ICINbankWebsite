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
@Table(name="Useraccount")
public class Useraccount {
	@Id
	@GeneratedValue
	@Column(name="U_NAME")
	private String u_name;
	@Column(name="F_NAME")
	private String f_name;
	@Column(name="L_NAME")
	private String l_name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE")
	private int phone;
	@Column(name="P_AC")
	private double p_ac;
	 @Column(name="S_AC")
		private double s_ac;
	 @Column(name="STATUS")
		private String status;
	public Useraccount(  String u_name,String f_name, String l_name,String email,int phone ,double p_ac,double s_ac,String status) {
		super();
		this.u_name = u_name;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.phone = phone;
		this.p_ac = p_ac;
		this.s_ac = s_ac;
		this.status = status;
		
	}
	
	public Useraccount()
	{
		
	}
	public String getU_NAME() {
		return u_name;
	}

	public void setU_NAME(String u_name) {
		this.u_name = u_name;
	}
		
	public String getF_NAME() {
		return f_name ;
	}

	public void setF_NAME(String f_name ) {
		this.f_name = f_name ;
	}
	public String getL_NAME() {
		return l_name;
	}

	public void setL_NAME(String l_name) {
		this.l_name = l_name;
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
public double getP_AC() {
		return p_ac;
	}

	public void setP_AC(double p_ac) {
		this.p_ac = p_ac;
	}
	public double getS_AC() {
		return s_ac;
	}

	public void setS_AC(double s_ac) {
		this.s_ac = s_ac;
	}
	public String getSTATUS() {
		return status;
	}

	public void setSTATUS(String status) {
		this.status = status;
	}
}

