package com.OnlineBanking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.depositRepository;
import com.OnlineBanking.model.deposit;


@Service
public class depositService {

	@Autowired
	depositRepository depositRepository;
	
	@Transactional
	public List<deposit> fetchdeposit() {
		List<deposit> depositList=depositRepository.findAll();
		return depositList;
		
	}
	@Transactional
	public deposit savedeposit(deposit deposit) {
		
		return depositRepository.save(deposit);
		
	}
	
	
	@Transactional
	public void deletedeposit(int account_no) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
           depositRepository.deleteById(account_no);
	
	}
	@Transactional 
	  public deposit getdeposit(int account_no) { 
	  Optional<deposit> optional= depositRepository.findById(account_no);
	  deposit a=optional.get();
	  return a;
	  }
	

}