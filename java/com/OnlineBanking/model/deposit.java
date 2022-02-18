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
@Table(name="deposit")
public class deposit {

	@Id
	@GeneratedValue
	@Column(name="account_no ")
	private int account_no;

        @Column(name="deposit_date")
	@Temporal(TemporalType.DATE)
	private Date deposit_date;


        @Column(name="transaction_id")
        private int transaction_id;
	@Column(name="account_title")
	private String account_title;
	@Column(name="amount ")
	private int amount;
	@Column(name="delivering_institution")
	private String delivering_institution;
	
	
	

	public deposit(int account_no , Date deposit_date,int transaction_id,String account_title,int amount,String delivering_institution) {
		super();
		this.account_no=account_no;
		this.deposit_date = deposit_date;
		this.transaction_id = transaction_id;
		this.account_title = account_title;
		this.amount = amount;
		this.delivering_institution = delivering_institution;

	}
	
	public deposit()
	{
		
	}
	private int account_no() {
		return account_no;
	}

	public void setaccount_no(int account_no) {
		this.account_no = account_no;
	}

	public Date getdeposit_date() {
		return deposit_date;
	}

	public void setdeposit_date(Date deposit_date ) {
		this.deposit_date = deposit_date ;
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
	
	public String getdelivering_institution() {
		return delivering_institution;
	}
	public void setdelivering_institution(String delivering_institution) {
		this.delivering_institution = delivering_institution;
	}

}
