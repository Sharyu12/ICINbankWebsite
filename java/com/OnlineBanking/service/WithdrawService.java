package com.OnlineBanking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.WithdrawRepository;
import com.OnlineBanking.model.Withdraw;


@Service
public class WithdrawService {

	@Autowired
	WithdrawRepository WithdrawRepository;
	
	@Transactional
	public List<Withdraw> fetchWithdraw() {
		List<Withdraw> WithdrawList=WithdrawRepository.findAll();
		return WithdrawList;
		
	}
	@Transactional
	public Withdraw saveWithdraw(Withdraw Withdraw) {
		
		return WithdrawRepository.save(Withdraw);
		
	}
	
	
	@Transactional
	public void deleteWithdraw(int transaction_id) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
           WithdrawRepository.deleteById(transaction_id);
	
	}
	@Transactional 
	  public Withdraw getWithdraw(int transaction_id) { 
	  Optional<Withdraw> optional= WithdrawRepository.findById(transaction_id);
	  Withdraw a=optional.get();
	  return a;
	  }
	

}