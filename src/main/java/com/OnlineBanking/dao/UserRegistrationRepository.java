package com.OnlineBanking.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration ,Integer>{
	@Query("SELECT p FROM UserRegistration p WHERE p.userName =?1 and p.password=?2")
	public UserRegistration validateUser(String userName,String password);

}
