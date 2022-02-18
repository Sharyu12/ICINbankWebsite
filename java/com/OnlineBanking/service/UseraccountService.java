package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.UseraccountRepository;
import com.OnlineBanking.model.Useraccount;



@Service
public class UseraccountService {
	@Autowired
	UseraccountRepository sRepository;
	
	@Transactional
	public List<Useraccount> fetchUseraccount() {
		List<Useraccount> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Useraccount saveUseraccount(Useraccount useraccount) {
		
		return sRepository.save(useraccount);	
	}
	
	@Transactional
	public void deleteUseraccount(String U_NAME) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(U_NAME);
	
	}
	@Transactional 
	  public Useraccount getUseraccount(String U_NAME) { 
	  Optional<Useraccount> optional= sRepository.findById(U_NAME);
	  Useraccount s=optional.get();
	  return s;
	  

}
}

