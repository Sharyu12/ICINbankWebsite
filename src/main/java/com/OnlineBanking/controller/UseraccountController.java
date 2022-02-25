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
import com.OnlineBanking.model.Useraccount;
import com.OnlineBanking.service.UseraccountService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UseraccountController {

	@Autowired
	UseraccountService sService;

//http://localhost:8080/api/v1/Useraccounts
	@GetMapping("/Useraccounts")
	public List<Useraccount> getUseraccounts() {
		List<Useraccount> sList = sService.fetchUseraccounts();

		return sList;

	}

	// http://localhost:8080/api/v1/Useraccount/1
	@GetMapping("/Useraccount/{Id}")
	public ResponseEntity<Useraccount> getUseraccountById(@PathVariable("Id") int Id)
			throws ResourceNotFoundException {
		Useraccount useraccount = sService.getUseraccount(Id);
		return ResponseEntity.ok().body(useraccount);
	}

	// http://localhost:8080/api/v1/saveEmployee
	@PostMapping("/Useraccount")
	public Useraccount addUseraccount(@RequestBody Useraccount s) {

		Useraccount useraccount = sService.saveUseraccount(s);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return useraccount;
	}

	// http://localhost:8080/api/v1/updateEmployee/2
	@PutMapping("/useraccount/{id}")
	public ResponseEntity<Useraccount> updateUseraccount(@PathVariable("id") int Id,
			@RequestBody Useraccount useraccountDetails) throws ResourceNotFoundException {
		Useraccount useraccount = sService.getUseraccount(Id);

		useraccount.setAddress(useraccountDetails.getAddress());
	useraccount.setName(useraccountDetails.getName());
		useraccount.setPhone(useraccountDetails.getPhone());
		final Useraccount updatedUseraccount = sService.saveUseraccount(useraccount);
		return ResponseEntity.ok(updatedUseraccount);
	}

//http://localhost:8080/api/v1/deleteEmployee/1
	@DeleteMapping(value = "/useraccount/{employeeId}")
	public ResponseEntity<Object> deleteUseraccount(@PathVariable("Id") int Id) {

	          sService.deleteUseraccount(Id);
		return new ResponseEntity<>("Useraccount deleted successsfully", HttpStatus.OK);
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
