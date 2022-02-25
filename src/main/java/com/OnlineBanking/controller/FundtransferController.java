package com.OnlineBanking.controller;

import java.util.HashMap;



import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBanking.exception.ResourceNotFoundException;
import com.OnlineBanking.model.Fundtransfer;
import com.OnlineBanking.model.Loanlist;
import com.OnlineBanking.service.FundtransferService;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class FundtransferController {
	@Autowired
	FundtransferService sService;

//http://localhost:8080/api/v1/getAllFundtransfer
	@GetMapping("/getAllFundtransfer")
	public List<Fundtransfer> getFundtransfer() {
		List<Fundtransfer> sList = sService.fetchFundtransfer();

		return sList;

	}

	// http://localhost:8080/api/v1/saveRequest
	@PostMapping("/saveFundtransfer")
	public Fundtransfer addFundtransfer(@RequestBody Fundtransfer s) {

		Fundtransfer fundtransfer = sService.saveFundtransfer(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return fundtransfer;
	}


}


