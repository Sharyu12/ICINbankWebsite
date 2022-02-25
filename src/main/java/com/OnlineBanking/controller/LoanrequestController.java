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
import com.OnlineBanking.model.Loanrequest;
import com.OnlineBanking.service.LoanrequestService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class LoanrequestController {

	@Autowired
	LoanrequestService sService;

//http://localhost:8080/api/v1/getAllEmployees
	@GetMapping("/loanrequest")
	public List<Loanrequest> getLoanrequest() {
		List<Loanrequest> sList = sService.fetchLoanrequests();

		return sList;

	}

	

	// http://localhost:8080/api/v1/loanrequest
	@PostMapping("/loanrequest")
	public Loanrequest addLoanrequest(@RequestBody Loanrequest s) {

		Loanrequest loanrequest = sService.saveLoanrequest(s);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return loanrequest;
	}

	

//http://localhost:8080/api/v1/loanrequest/1
	@DeleteMapping(value = "/loanrequest/{Id}")
	public ResponseEntity<Object> deleteLoanrequest(@PathVariable("Id") int Id) {

	sService.deleteLoanrequest(Id);
		return new ResponseEntity<>("Loanrequest deleted successsfully", HttpStatus.OK);
	}
	

}
