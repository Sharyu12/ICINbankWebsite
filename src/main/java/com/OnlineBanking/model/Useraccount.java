package com.OnlineBanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Useraccount_info")
public class Useraccount {
	@Id
	@GeneratedValue
	@Column(name="no")
	private int Id;
	@Column(name="u_name")
	private String u_name;
	@Column(name="p_no")
	private int p_no;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	@Column(name="contact")
	private int phone;
	@Column(name="s_no")
	private int s_no;
	@Column(name="status")
	private String status;
	
	public Useraccount(String u_name,int p_no,String name,String address,String email	,int phone,int s_no,String status) {
        super();
        this.u_name = u_name;
        this.p_no = p_no;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.s_no = s_no;
        this.status= status;
       
    }
	public Useraccount() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	}

