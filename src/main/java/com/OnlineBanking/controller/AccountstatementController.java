package com.OnlineBanking.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.OnlineBanking.model.Accountstatement;
import com.OnlineBanking.service.AccountstatementService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AccountstatementController {

	@Autowired
	AccountstatementService aService;

//http://localhost:8080/api/v1/Get:/Accountstatement
	@GetMapping("/Get:/Accountstatement")
	public List<Accountstatement> getAccountstatement() {
		List<Accountstatement> aList = aService.fetchAccountstatement();

		return aList;

	}

	// http://localhost:8080/api/v1/GET:/Accountstatement/1
	@GetMapping("/GET:/Accountstatement/{account_no}")
	public ResponseEntity<Accountstatement> getAccountstatementById(@PathVariable("account_no") int account_no)
			throws ResourceNotFoundException {
		Accountstatement a = aService.getAccountstatement(account_no);
		return ResponseEntity.ok().body(a);
	}

	// http://localhost:8080/api/v1/POST:/Accountstatement
	@PostMapping("/POST:/Accountstatement")
	public Accountstatement addAccountstatement(@RequestBody Accountstatement a) {

		Accountstatement Accountstatement = aService.saveAccountstatement(a);

		// return new ResponseEntity<>("Employee added successfully", HttpStatus.OK);
		return Accountstatement;
	}

	

//http://localhost:8080/api/v1/deleteAccountstatement/1
	@DeleteMapping(value = "/deleteAccountstatement/{account_no}")
	public ResponseEntity<Object> deleteAccountstatement(@PathVariable("account_no") int account_no) {

		aService.deleteAccountstatement(account_no);
		return new ResponseEntity<>("Accountstatement deleted successsfully", HttpStatus.OK);
	}
	
}