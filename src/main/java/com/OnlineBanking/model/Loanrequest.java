package com.OnlineBanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employ_info")
public class Loanrequest {
	@Id
	@GeneratedValue
	@Column(name="no")
	private int id;
	@Column(name="name")
	private String Name;
	@Column(name="a_no")
	private int a_no;
	@Column(name="email")
	private String emailId;
	@Column(name="gender")
	private String gender;
	@Column(name="phone")
	private int phone;
	@Column(name="address")
	private String address;
	@Column(name="designation")
	private String designation;
	@Column(name="loantype")
	private String loantype;
	@Column(name="loanamount")
	private int loanamount;
	@Column(name="netsalary")
	private int netsalary;
	public Loanrequest(String Name, int a_no, String emailId, String gender,int phone , String address ,String designation,String loantype,int loanamount,int netsalary) {
        super();
        this.Name = Name;
        this.a_no = a_no;
        this.phone = phone;
        this.emailId = emailId;
        this.gender = gender;
        this.address = address;
        this.designation = designation;
        this.loantype = loantype;
        this.loanamount = loanamount;
        this.netsalary = netsalary;
    }
	public Loanrequest() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int geta_no() {
		return a_no;
	}
	public void seta_no(int a_no) {
		this.a_no = a_no;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public int getphone() {
		return phone;
	}
	public void setphone(int phone) {
		this.phone= phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	public String getloantype() {
		return loantype;
	}
	public void setloantype(String loantype) {
		this.loantype = loantype;
	}
		public int getloanamount() {
			return loanamount;
		}
		public void setloanamount(int loanamount) {
			this.loanamount = loanamount;
		}
		public int genetsalary() {
			return netsalary;
		}
		public void setnetsalary(int netsalary) {
			this.netsalary = netsalary;
		}
	}

