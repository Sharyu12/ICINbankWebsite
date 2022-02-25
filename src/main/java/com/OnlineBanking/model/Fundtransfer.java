package com.OnlineBanking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Fundtransfer")
public class Fundtransfer {
	@Id
	@GeneratedValue
	@Column(name = "s_no")
	private int s_no;
	@Column(name = "a_no")
	private long a_no;
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "ta_no")
	private long ta_no;
	@Column(name = "amount")
	private double amount;
	@GeneratedValue
	@Column(name = "t_id")
	private long t_id;
	
	public Fundtransfer() {

	}

	public Fundtransfer(int s_no, long a_no, Date date, long ta_no, double amount, long t_id) {
		super();
		this.s_no = s_no;
		this.a_no = a_no;
		this.date = date;
		this.ta_no = ta_no;
		this.amount = amount;
		this.t_id = t_id;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public long getA_no() {
		return a_no;
	}

	public void setA_no(long a_no) {
		this.a_no = a_no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getTa_no() {
		return ta_no;
	}

	public void setTa_no(long ta_no) {
		this.ta_no = ta_no;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getT_id() {
		return t_id;
	}

	public void setT_id(long t_id) {
		this.t_id = t_id;
	}


	
}
