package com.OnlineBanking.service;

import java.util.List;


import java.util.Optional;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBanking.dao.ChequebookRepository;
import com.OnlineBanking.model.Chequebook;



@Service
public class ChequebookService {
	@Autowired
	ChequebookRepository sRepository;
	
	@Transactional
	public List<Chequebook> fetchRequest() {
		List<Chequebook> sList=sRepository.findAll();
		return sList;
		
	}
	@Transactional
	public Chequebook saveRequest(Chequebook s) {
		
		return sRepository.save(s);	
	}
	
	@Transactional
	public void deleteRequest(String u_NAME) {
		//empRepository.delete(dis);	
		System.out.println("service method called");
		sRepository.deleteById(u_NAME);
	
	}
	@Transactional 
	  public Chequebook getRequest(String U_NAME) { 
	  Optional<Chequebook> optional= sRepository.findById(U_NAME);
	  Chequebook s=optional.get();
	  return s;
	  

}
}

