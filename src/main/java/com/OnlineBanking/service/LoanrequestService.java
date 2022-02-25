package com.OnlineBanking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.LoanrequestRepository;
import com.OnlineBanking.model.Loanrequest;

@Service
public class LoanrequestService {

	@Autowired
	LoanrequestRepository sRepository;
	
	@Transactional
	public List<Loanrequest> fetchLoanrequests() {
		List<Loanrequest> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Loanrequest saveLoanrequest(Loanrequest loanrequest) {
		
		return sRepository.save(loanrequest);
		
	}
	@Transactional
	public void updateLoanrequest(Loanrequest s) {
		sRepository.save(s);	
	
	}
	
	@Transactional
	public void deleteLoanrequest(int Id) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
		sRepository.deleteById(Id);
	
	}
	
}
