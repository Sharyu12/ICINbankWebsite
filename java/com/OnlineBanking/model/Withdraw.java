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
@Table(name="withdraw")
public class Withdraw {

	@Id
	@GeneratedValue
	@Column(name="account_no ")
	private int account_no;
	@Column(name="withdraw_date")
	@Temporal(TemporalType.DATE)
	private Date withdraw_date;
	@Column(name="transaction_id")
	private int transaction_id;
	@Column(name="account_title")
	private String account_title;
	@Column(name="amount")
	private int amount;
	@Column(name="receiving_institution")
	private String receiving_institution;
	

	public Withdraw(int account_no , Date withdraw_date,int transaction_id,String account_title,int amount,String receiving_institution ) {
		super();
		this.account_no=account_no;
		this.withdraw_date = withdraw_date;
		this.transaction_id = transaction_id;
		this.account_title = account_title;
		this.amount = amount;
		this.receiving_institution = receiving_institution;
		

	}
	
	public Withdraw()
	{
		
	}
	private int account_no() {
		return account_no;
	}

	public void setaccount_no(int account_no) {
		this.account_no = account_no;
	}
	private Date getwithdraw_date() {
		return withdraw_date;
	}

	public void setwithdraw_date(Date withdraw_date) {
		this.withdraw_date = withdraw_date;
	}
	public int gettransaction_id() {
		return transaction_id;
	}

	public void settransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	public String getaccount_title() {
		return account_title;
	}

	public void setaccount_title(String account_title) {
		this.account_title = account_title;
	}
	
	public int getamount() {
		return amount;
	}

	public void setamount(int amount) {
		this.amount = amount;
	}
	
	public String receiving_institution() {
		return receiving_institution;
	}
	public void setreceiving_institution(String receiving_institution) {
		this.receiving_institution = receiving_institution;
	}
}
