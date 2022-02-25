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
@Table(name = "Recipient")
public class Recipient {
	@Id
    @GeneratedValue
    @Column(name = "s_no")
	private int s_no;
	@Column(name = "a_name")
	private String a_name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private long phone;
	@Column(name = "p_ac")
	private long p_ac;
	@Column(name = "s_ac")
	private long s_ac;
	@Column(name = "description")
	private String description;



	public Recipient() {

	}



	public Recipient(int s_no, String a_name, String email, long phone, long p_ac, long s_ac, String description) {
		super();
		this.s_no = s_no;
		this.a_name = a_name;
		this.email = email;
		this.phone = phone;
		this.p_ac = p_ac;
		this.s_ac = s_ac;
		this.description = description;
	}



	public int getS_no() {
		return s_no;
	}



	public void setS_no(int s_no) {
		this.s_no = s_no;
	}



	public String getA_name() {
		return a_name;
	}



	public void setA_name(String a_name) {
		this.a_name = a_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public long getP_ac() {
		return p_ac;
	}



	public void setP_ac(long p_ac) {
		this.p_ac = p_ac;
	}



	public long getS_ac() {
		return s_ac;
	}



	public void setS_ac(long s_ac) {
		this.s_ac = s_ac;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	


}
