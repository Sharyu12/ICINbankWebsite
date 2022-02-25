package com.OnlineBanking.dao;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.Admin;

public interface AdminRepository  extends JpaRepository<Admin ,Integer>{
	@Query("SELECT a FROM Admin a WHERE a.u_name =?1 and a.pwd=?2")
	public Admin validateUser(String u_name,String pwd);
}
 