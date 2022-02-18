package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.LoanRepository;
import com.OnlineBanking.model.Loan;



@Service
public class LoanService {
	@Autowired
	LoanRepository sRepository;
	
	@Transactional
	public List<Loan> fetchLoan() {
		List<Loan> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Loan saveLoan(Loan loan) {
		
		return sRepository.save(loan);	
	}
	
	@Transactional
	public void deleteLoan(int A_No) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_No);
	
	}
	@Transactional 
	  public Loan getLoan(int A_No) { 
	  Optional<Loan> optional= sRepository.findById(A_No);
	  Loan s=optional.get();
	  return s;
	  

}
}

