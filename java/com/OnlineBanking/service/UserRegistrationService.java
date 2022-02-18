package com.OnlineBanking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.UserRegistrationRepository;
import com.OnlineBanking.model.UserRegistration;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepository regRepository;
	
	@Transactional
	public List<UserRegistration> fetchUserRegistration() {
		List<UserRegistration> regList=regRepository.findAll();
		return regList;
		
	}
	@Transactional
	public UserRegistration saveUserRegistration(UserRegistration userregistration) {
		
		return regRepository.save(userregistration);
		
	}
	
	public UserRegistration validateUser(UserRegistration user) {
		UserRegistration u=regRepository.validateUser(user.getUserName(),user.getPassword());
		
		return u;
	}

}
