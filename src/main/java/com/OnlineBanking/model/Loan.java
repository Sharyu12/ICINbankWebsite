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
@Table(name="loanrequest")
public class Loan {

	@Id
	@GeneratedValue
	@Column(name="no")
	private int Id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="Phone")
	private int phone;
	@Column(name="GENDER")
	private String gender;
	@Column(name="A_No")
	private int a_no;
    @Column(name="Address")
	private String address;
    @Column(name="Designation")
	private String designation;
    @Column(name="Net_Salary")
	private int netsalary;
    @Column(name="Loan_Type")
	private String loantype;
    @Column(name="Loan_Amount")
	private int loanamount;
	
	public Loan( String name,String email ,int phone, String gender, int a_no,String address,String designation,int netsalary ,String loantype,int loanamount) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.a_no = a_no;
		this.address = address;
		this.designation = designation;
		this.netsalary = netsalary;
		this.loantype = loantype;
		this.loanamount = loanamount;
	}
	
	public Loan()
	{
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNAME() {
		return name;
	}

	public void setNAME(String name) {
		this.name = name;
	}
	 public String getEMAIL() {
			return email;
		}

		public void setEMAIL(String email) {
			this.email = email;
		}
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getGENDER() {
		return gender;
	}

	public void setGENDER(String gender) {
		this.gender = gender;
	}
public int getA_No() {
		return a_no;
	}

	public void setA_No(int a_no) {
		this.a_no = a_no;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
public int getNet_salary() {
		return netsalary;
	}

	public void Net_salary(int netsalary) {
		this.netsalary = netsalary;
	}
	public String Loan_Type() {
		return loantype;
	}

	public void setLoan_Type(String loantype) {
		this.loantype = loantype;
	}
	public int getLoan_Amount() {
		return loanamount;
	}

	public void Loan_Amount(int loanamount) {
		this.loanamount = loanamount;
	}

}

