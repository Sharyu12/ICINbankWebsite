package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.TransactionRepository;
import com.OnlineBanking.model.Transaction;



@Service
public class TransactionService {
	@Autowired
	TransactionRepository sRepository;
	
	@Transactional
	public List<Transaction> fetchTransaction() {
		List<Transaction> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Transaction saveTransaction(Transaction transaction) {
		
		return sRepository.save(transaction);	
	}
	
	@Transactional
	public void deleteTransaction(int A_NO) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_NO);
	
	}
	@Transactional 
	  public Transaction getTransaction(int A_No) { 
	  Optional<Transaction> optional= sRepository.findById(A_No);
	  Transaction s=optional.get();
	  return s;
	  

}
}

