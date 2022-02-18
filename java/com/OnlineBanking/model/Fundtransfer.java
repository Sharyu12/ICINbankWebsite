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
@Table(name="Fundtransfer")
public class Fundtransfer {
	@Id
	@GeneratedValue
	@Column(name="A_No")
	private int a_no;
	@Column(name="DATE")
	@Temporal(TemporalType. DATE) 
	private Date date;
	
	 @Column(name="TA_NO")
		private double ta_no;
	
    @Column(name="AMOUNT")
	private double amount;
    @Column(name="T_ID")
	private double t_id;
	
	public Fundtransfer(  int a_no,Date date,double ta_no ,double amount,double t_id) {
		super();
		this.a_no = a_no;
		this.date = date;
		this.ta_no= ta_no;
		this.amount = amount;
		this.t_id = t_id;
		
	}
	
	public Fundtransfer()
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
public double getTA_NO() {
		return ta_no;
	}

	public void setTA_NO(double ta_no) {
		this.ta_no = ta_no;
	}
	public double getAMOUNT() {
		return amount;
	}

	public void setAMOUNT(double amount) {
		this.amount = amount;
	}
	public double getT_ID() {
		return t_id;
	}

	public void setT_ID(double ta_no) {
		this.t_id = t_id;
	}
}

