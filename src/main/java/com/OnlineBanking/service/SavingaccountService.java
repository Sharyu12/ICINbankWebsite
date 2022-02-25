package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.SavingaccountRepository;
import com.OnlineBanking.model.Savingaccount;



@Service
public class SavingaccountService {
	@Autowired
	SavingaccountRepository sRepository;
	
	@Transactional
	public List<Savingaccount> fetchSavingaccount() {
		List<Savingaccount> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Savingaccount saveSavingaccount(Savingaccount savingaccount) {
		
		return sRepository.save(savingaccount);	
	}
	
	@Transactional
	public void deleteSavingaccount(int A_NO) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_NO);
	
	}
	@Transactional 
	  public Savingaccount getSavingaccount(int Id) { 
	  Optional<Savingaccount> optional= sRepository.findById(Id);
	  Savingaccount s=optional.get();
	  return s;
	  

}
}

