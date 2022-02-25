package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.PrimaryaccountRepository;
import com.OnlineBanking.model.Primaryaccount;



@Service
public class PrimaryaccountService {
	@Autowired
	PrimaryaccountRepository sRepository;
	
	@Transactional
	public List<Primaryaccount> fetchPrimaryaccount() {
		List<Primaryaccount> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Primaryaccount savePrimaryaccount(Primaryaccount primaryaccount) {
		
		return sRepository.save(primaryaccount);	
	}
	
	@Transactional
	public void deletePrimaryaccount(int A_NO) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_NO);
	
	}
	@Transactional 
	  public Primaryaccount getPrimaryaccount(int A_No) { 
	  Optional<Primaryaccount> optional= sRepository.findById(A_No);
	  Primaryaccount s=optional.get();
	  return s;
	  

}
}

