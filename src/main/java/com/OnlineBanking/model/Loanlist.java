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
@Table(name="Loanlist")
public class Loanlist {

	@Id
	@GeneratedValue
	@Column(name="DATE")
	@Temporal(TemporalType. DATE) 
	private Date date;
	@Column(name="U_NAME")
	private String u_name;
	@Column(name="A_No")
	private int a_no;
    @Column(name="DESIGNATION")
	private String designation;
    @Column(name="NET_SALARY")
	private int net_salary;
    @Column(name="A_TYPE")
   	private String a_type;
    @Column(name="LOAN_TYPE")
	private String loan_type;
    @Column(name="LOAN_AMOUNT")
	private int loan_amount;
	
	public Loanlist( Date date,String u_name, int a_no,String designation,int net_salary ,String a_type,String loan_type,int loan_amount) {
		super();
		this.date = date;
		this.u_name = u_name;
		this.a_no = a_no;
		this.designation = designation;
		this.net_salary = net_salary;
		this.a_type = a_type;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
	}
	
	public Loanlist()
	{
		
	}
	public Date getDATE() {
		return date;
	}

	public void setDATE(Date date) {
		this.date = date;
	}		
	public String getU_NAME() {
		return u_name;
	}

	public void setU_NAME(String u_name) {
		this.u_name = u_name;
	}
	 
public int getA_No() {
		return a_no;
	}

	public void setA_No(int a_no) {
		this.a_no = a_no;
	}
	
	public String getDESIGNATION() {
		return designation;
	}

	public void setDESIGNATION(String designation) {
		this.designation = designation;
	}
public int getNET_SALARY() {
		return net_salary;
	}

	public void NET_SALARY(int net_salary) {
		this.net_salary = net_salary;
	}
	public String A_TYPE() {
		return a_type;
	}

	public void setA_TYPE(String a_type) {
		this.a_type = a_type;
	}
	public String LOAN_TYPE() {
		return loan_type;
	}

	public void setLOAN_TYPE(String loan_type) {
		this.loan_type = loan_type;
	}
	public int getLOAN_AMOUNT() {
		return loan_amount;
	}

	public void LOAN_AMOUNT(int loan_amount) {
		this.loan_amount = loan_amount;
	}

}

