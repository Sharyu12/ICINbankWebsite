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
	public List<Useraccount> fetchUseraccounts() {
		List<Useraccount> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Useraccount saveUseraccount(Useraccount useraccount) {
		
		return sRepository.save(useraccount);
		
	}
	@Transactional
	public void updateUseraccount(Useraccount s) {
		sRepository.save(s);	
	
	}
	
	@Transactional
	public void deleteUseraccount(int Id) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		sRepository.deleteById(Id);
	
	}
	@Transactional 
	  public Useraccount getUseraccount(int id) { 
	  Optional<Useraccount> optional= sRepository.findById(id);
	  Useraccount s=optional.get();
	  return s;
	  

}
}
