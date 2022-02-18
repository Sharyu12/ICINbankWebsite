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
	@Column(name="Statementperiod ")
	private String Statementperiod;
        @Column(name="Accountnumber")
        private int Accountnumber;
        @Column(name="Statementdate")
	@Temporal(TemporalType.DATE)
	private Date Statementdate;
        @Column(name="Description")
        private String Description;
        @Column(name="Ref")
        private int Ref;
        @Column(name="Withdrawals")
        private int Withdrawals;
        @Column(name="Deposits")
        private int Deposits;
        @Column(name="Balance")
        private int Balance;  
	

	public Accountstatement(String Statementperiod , int Accountnumber,Date Statementdate,String Description,int Ref,int Withdrawals,int Deposits,int Balance) {
		super();
		this.Statementperiod = Statementperiod;
		this.Accountnumber = Accountnumber;
		this.Statementdate = Statementdate;
		this.Description = Description;
		this.Ref = Ref;
		this.Withdrawals = Withdrawals;
        this.Deposits = Deposits;
        this.Balance =  Balance;
	}
	
	public Accountstatement()
	{
		
	}
	private String Statementperiod() {
		return Statementperiod;
	}

	public void setStatementperiod(String Statementperiod) {
		this.Statementperiod = Statementperiod;
	}

         private int Accountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(int Accountnumber) {
		this.Accountnumber = Accountnumber;
	}

        public Date getStatementdate() {
		return Statementdate;
	}

	public void setStatementdate(Date Statementdate ) {
		this.Statementdate = Statementdate ;
	}


        private String Description() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

        public int getRef() {
		return Ref;
	}

	public void setRef(int Ref) {
		this.Ref = Ref;
	}
         public int Withdrawals() {
		return Withdrawals;
	}

	public void setWithdrawals(int Withdrawals) {
		this.Withdrawals = Withdrawals;
	}


       public int Deposits() {
		return Deposits;
	}

	public void setDeposits(int Deposits) {
		this.Deposits = Deposits;
	}
	public int Balance() {
		return Balance;
	}

	public void setBalance(int Balance) {
		this.Balance = Balance;
	}
	

}