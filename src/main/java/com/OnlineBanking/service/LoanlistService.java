package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.LoanlistRepository;
import com.OnlineBanking.model.Loanlist;



@Service
public class LoanlistService {
	@Autowired
	LoanlistRepository sRepository;
	
	@Transactional
	public List<Loanlist> fetchLoanlist() {
		List<Loanlist> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Loanlist saveLoanlist(Loanlist loanlist) {
		
		return sRepository.save(loanlist);	
	}
	
	@Transactional
	public void deleteLoanlist(int A_NO) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_NO);
	
	}
	@Transactional 
	  public Loanlist getLoanlist(int A_No) { 
	  Optional<Loanlist> optional= sRepository.findById(A_No);
	  Loanlist s=optional.get();
	  return s;
	  

}
}

