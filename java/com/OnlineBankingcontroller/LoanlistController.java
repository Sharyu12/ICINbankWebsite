package com.OnlineBankingcontroller;

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
import com.OnlineBanking.model.Loanlist;
import com.OnlineBanking.service.LoanlistService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class LoanlistController {
	@Autowired
	LoanlistService sService;

//http://localhost:8080/api/v1/getAllTransaction
	@GetMapping("/getAllLoanlist")
	public List<Loanlist> getLoanlist() {
		List<Loanlist> sList = sService.fetchLoanlist();

		return sList;

	}

	// http://localhost:8080/api/v1/saveLoanlist
	@PostMapping("/saveLoanlist")
	public Loanlist addLoanlist(@RequestBody Loanlist s) {

		Loanlist loanlist = sService.saveLoanlist(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return loanlist;
	}

	
//http://localhost:8080/api/v1/deleteLoanlist/1234
	@DeleteMapping(value = "/deleteLoanlist/{A_NO}")
	public ResponseEntity<Object> deleteLoanlist(@PathVariable("A_NO") int A_NO) {

		sService.deleteLoanlist(A_NO);
		return new ResponseEntity<>("Loan Request Rejected successsfully", HttpStatus.OK);
	}
	
	/* * @DeleteMapping("/deleteEmployee/{id}") public Map<String, Boolean>
	 * deleteEmployee(@PathVariable("id") int employeeId) throws
	 * ResourceNotFoundException { // Employee employee =
	 * empService.getEmployee(employeeId);
	 * 
	 * System.out.println("delete method called");
	 * empService.deleteEmployee(employeeId); Map<String, Boolean> response = new
	 * HashMap<>(); response.put("deleted", Boolean.TRUE); return response; }
	 */

}


