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
@Table(name="Accountstatement")
public class Accountstatement {

	@Id
	@GeneratedValue
	@Column(name="no")
	private int id;
	@Column(name="Statementperiod ")
	private String s_period;
    @Column(name="Accountnumber")
    private int a_no;
    @Column(name="Statementdate")
	@Temporal(TemporalType.DATE)
	private Date date;
        @Column(name="Description")
        private String description;
        @Column(name="Ref")
        private int Ref;
        @Column(name="Withdrawals")
        private int withdraw;
        @Column(name="Deposits")
        private int deposit;
        @Column(name="Balance")
        private int balance;  
	

	public Accountstatement(String s_period , int a_no,Date date,String description,int Ref,int withdraw,int deposit,int balance) {
		super();
		this.s_period = s_period;
		this.a_no = a_no;
		this.date = date;
		this.description = description;
		this.Ref = Ref;
		this.withdraw = withdraw;
        this.deposit = deposit;
        this.balance =  balance;
	}
	
	public Accountstatement()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getS_period() {
		return s_period;
	}

	public void setS_period(String s_period) {
		this.s_period = s_period;
	}

	public int getA_no() {
		return a_no;
	}

	public void setA_no(int a_no) {
		this.a_no = a_no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRef() {
		return Ref;
	}

	public void setRef(int ref) {
		Ref = ref;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	}