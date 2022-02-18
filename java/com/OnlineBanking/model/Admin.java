package com.OnlineBanking.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="admin") 
public class Admin {
	@Id
	
	
	@Column(name="u_name")
	private String u_name;
	
	@Column(name="pwd")
	private String pwd;

	public Admin(String u_name, String pwd) { 
		super();
		
		this.u_name = u_name;
		this.pwd = pwd;
	}
public Admin() {
	
}
	public String getu_name() {
		return u_name;
	}

	public void seta_name(String u_name) {
		this.u_name = u_name;
	}

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
}