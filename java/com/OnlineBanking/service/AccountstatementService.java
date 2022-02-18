package com.OnlineBanking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.AccountstatementRepository;
import com.OnlineBanking.model.Accountstatement;


@Service
public class AccountstatementService {

	@Autowired
	AccountstatementRepository sRepository;
	
	@Transactional
	public List<Accountstatement> fetchAccountstatement() {
		List<Accountstatement> AccountstatementList=sRepository.findAll();
		return AccountstatementList;
		
	}
	@Transactional
	public Accountstatement saveAccountstatement(Accountstatement Accountstatement) {
		
		return sRepository.save(Accountstatement);
		
	}
	
	
	@Transactional
	public void deleteAccountstatement(int account_no) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
           sRepository.deleteById(account_no);
	
	}
	@Transactional 
	  public Accountstatement getAccountstatement(int account_no) { 
	  Optional<Accountstatement> optional= sRepository.findById(account_no);
	  Accountstatement a=optional.get();
	  return a;
	  }
	

}