package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.RecipientRepository;
import com.OnlineBanking.model.Recipient;



@Service
public class RecipientService {
	@Autowired
	RecipientRepository sRepository;
	
	@Transactional
	public List<Recipient> fetchRecipient() {
		List<Recipient> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Recipient saveRecipient(Recipient recipient) {
		
		return sRepository.save(recipient);	
	}
	
	@Transactional
	public void deleteRecipient(String U_NAME) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(U_NAME);
	
	}
	@Transactional 
	  public Recipient getRecipient(String U_NAME) { 
	  Optional<Recipient> optional= sRepository.findById(U_NAME);
	  Recipient s=optional.get();
	  return s;
	  

}
}

