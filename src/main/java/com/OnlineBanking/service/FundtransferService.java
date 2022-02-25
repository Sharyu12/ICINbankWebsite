package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.FundtransferRepository;
import com.OnlineBanking.model.Fundtransfer;



@Service
public class FundtransferService {
	@Autowired
	FundtransferRepository sRepository;
	
	@Transactional
	public List<Fundtransfer> fetchFundtransfer() {
		List<Fundtransfer> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Fundtransfer saveFundtransfer(Fundtransfer fundtransfer) {
		
		return sRepository.save(fundtransfer);	
	}
	
	@Transactional
	public void deleteFundtransfer(int A_NO) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(A_NO);
	
	}
	@Transactional 
	  public Fundtransfer getFundtransfer(int A_No) { 
	  Optional<Fundtransfer> optional= sRepository.findById(A_No);
	  Fundtransfer s=optional.get();
	  return s;
	  

}
}

