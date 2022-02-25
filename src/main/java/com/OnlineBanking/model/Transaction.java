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
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue
	@Column(name="A_No")
	private int a_no;
	@Column(name="A_TYPE")
	private String a_type;
	@Column(name="DATE")
	@Temporal(TemporalType. DATE) 
	private Date date;
	@Column(name="PARTICULARS")
	private String particulars;
	@Column(name="DEBIT")
	private int debit;
	 @Column(name="CREDIT")
		private int credit;
	
    @Column(name="BALANCE")
	private int balance;
	
	public Transaction(  int a_no,String a_type,Date date, String particulars,int debit ,int credit,int balance) {
		super();
		this.a_no = a_no;
		this.a_type = a_type;
		this.date = date;
		this.particulars = particulars;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
	}
	
	public Transaction()
	{
		
	}
	public int getA_NO() {
		return a_no;
	}
	public void setA_NO(int a_no) {
		this.a_no = a_no;
	}
	 public String A_TYPE() {
			return a_type;
		}
	 public Date getDATE() {
			return date;
		}

		public void setDATE(Date date) {
			this.date = date;
		}		
	
	public String getPARTICULARS() {
		return particulars;
	}

	public void setPARTICULARS(String particulars) {
		this.particulars = particulars;
	}
public int getDEBIT() {
		return debit;
	}

	public void setDEBIT(int debit) {
		this.debit = debit;
	}
	public int getCREDIT() {
		return credit;
	}

	public void setCREDIT(int credit) {
		this.credit = credit;
	}
	public int getBALANCE() {
		return balance;
	}

	public void setBALANCE(int balance) {
		this.balance = balance;
	}
}

