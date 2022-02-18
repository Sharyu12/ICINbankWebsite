package com.OnlineBankingcontroller;

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
import com.OnlineBanking.model.Loan;
import com.OnlineBanking.service.LoanService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class LoanController {
	@Autowired
	LoanService sService;

//http://localhost:8080/api/v1/getAllLoans
	@GetMapping("/getAllLoans")
	public List<Loan> getLoans() {
		List<Loan> sList = sService.fetchLoan();

		return sList;

	}

	// http://localhost:8080/api/v1/getLoan/1234
	@GetMapping("/getLoan/{A_No}")
	public ResponseEntity<Loan> getLoanById(@PathVariable("A_No") int A_No)
			throws ResourceNotFoundException {
		Loan loan = sService.getLoan(A_No);
		return ResponseEntity.ok().body(loan);
	}

	// http://localhost:8080/api/v1/saveDisease
	@PostMapping("/saveLoan")
	public Loan addLoan(@RequestBody Loan s) {

		Loan loan = sService.saveLoan(s);

		// return new ResponseEntity<>("Disease added successsfully", HttpStatus.OK);
		return loan;
	}

	
//http://localhost:8080/api/v1/deleteDisease/93
	@DeleteMapping(value = "/deleteLoan/{A_No}")
	public ResponseEntity<Object> deleteLoan(@PathVariable("A_No") int A_No) {

		sService.deleteLoan(A_No);
		return new ResponseEntity<>("Loan Rejected successsfully", HttpStatus.OK);
	}
	/*
	 * @DeleteMapping("/deleteEmployee/{id}") public Map<String, Boolean>
	 * deleteEmployee(@PathVariable("id") int employeeId) throws
	 * ResourceNotFoundException { // Employee employee =
	 * empService.getEmployee(employeeId);
	 * 
	 * System.out.println("delete method called");
	 * empService.deleteEmployee(employeeId); Map<String, Boolean> response = new
	 * HashMap<>(); response.put("deleted", Boolean.TRUE); return response; }
	 */

}


