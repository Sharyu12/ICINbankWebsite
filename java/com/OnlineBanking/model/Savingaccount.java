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
@Table(name="Saveaccount")
public class Savingaccount {
	@Id
	@GeneratedValue
	@Column(name="A_No")
	private int a_no;
	@Column(name="DATE")
	@Temporal(TemporalType. DATE) 
	private Date date;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PHONE")
	private int phone;
	@Column(name="PINCODE")
	private int pincode;
	@Column(name="B_NAME")
	private String b_name;
	@Column(name="B_CODE")
	private int b_code;
	@Column(name="B_ADDRESS")
	private String b_address;
	 @Column(name="MICR_CODE")
		private int micr_code;
    @Column(name="IFSC_CODE")
	private int ifsc_code;
	public Savingaccount(int a_no,Date date,String name,String address ,int phone,int pincode, String b_name,int b_code ,String b_address,int micr_code,int ifsc_code) {
		super();
		this.a_no = a_no;
		this.date = date;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pincode = pincode;
		this.b_name = b_name;
		this.b_code = b_code;
		this.b_address = b_address;
		this.micr_code = micr_code;
		this.ifsc_code = ifsc_code;
	}
	
	public Savingaccount()
	{
		
	}
	public int getA_NO() {
		return a_no;
	}
	public void setA_NO(int a_no) {
		this.a_no = a_no;
	}
	 
	 public Date getDATE() {
			return date;
		}

		public void setDATE(Date date) {
			this.date = date;
		}		
		public String getNAME() {
			return name;
		}

		public void setNAME(String name) {
			this.name = name;
		}
	public String getADDRESS() {
		return address;
	}

	public void setADDRESS(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
public int getPINCODE() {
		return pincode;
	}

	public void setPINCODE(int pincode) {
		this.pincode = pincode;
	}
	public String getB_NAME() {
		return b_name;
	}

	public void setB_NAME(String b_name) {
		this.b_name = b_name;
	}
	public int getB_CODE() {
		return b_code;
	}

	public void setB_CODE(int b_code) {
		this.b_code = b_code;
	}
	public String getB_ADDRESS() {
		return b_address;
	}

	public void setB_ADDRESS(String b_address) {
		this.b_address = b_address;
	}
	public int getMIR_CODE() {
		return micr_code;
	}

	public void setMICR_CODE(int micr_code) {
		this.micr_code = micr_code;
	}
	public int getIFSC_CODE() {
		return ifsc_code;
	}

	public void setIFSC_CODE(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
}

