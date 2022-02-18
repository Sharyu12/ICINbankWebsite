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
import com.OnlineBanking.model.Chequebook;
import com.OnlineBanking.service.ChequebookService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class ChequebookController {
	@Autowired
	ChequebookService sService;

//http://localhost:8080/api/v1/getAllRequest
	@GetMapping("/getAllRequest")
	public List<Chequebook> getRequest() {
		List<Chequebook> sList = sService.fetchRequest();

		return sList;

	}

	// http://localhost:8080/api/v1/saveRequest
	@PostMapping("/saveRequest")
	public Chequebook addRequest(@RequestBody Chequebook s) {

		Chequebook request = sService.saveRequest(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return request;
	}

	
//http://localhost:8080/api/v1/deleteRequest/john
	@DeleteMapping(value = "/deleteRequest/{U_NAME}")
	public ResponseEntity<Object> deleteLoan(@PathVariable("U_NAME") String U_NAME) {

		sService.deleteRequest(U_NAME);
		return new ResponseEntity<>("Checkbook Request Rejected successsfully", HttpStatus.OK);
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


