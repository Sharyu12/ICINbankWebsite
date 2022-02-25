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
import com.OnlineBanking.model.Transaction;
import com.OnlineBanking.service.TransactionService;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class TransactionController {
	@Autowired
	TransactionService sService;

//http://localhost:8080/api/v1/getAllTransaction
	@GetMapping("/getAllTransaction")
	public List<Transaction> getTransaction() {
		List<Transaction> sList = sService.fetchTransaction();

		return sList;

	}

	// http://localhost:8080/api/v1/saveRequest
	@PostMapping("/saveTransaction")
	public Transaction addTransaction(@RequestBody Transaction s) {

		Transaction transaction = sService.saveTransaction(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return transaction;
	}

	
//http://localhost:8080/api/v1/deleteRequest/john
	@DeleteMapping(value = "/deleteTransaction/{A_NO}")
	public ResponseEntity<Object> deleteTransaction(@PathVariable("A_NO") int A_NO) {

		sService.deleteTransaction(A_NO);
		return new ResponseEntity<>("Transaction Report Deleted successsfully", HttpStatus.OK);
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


