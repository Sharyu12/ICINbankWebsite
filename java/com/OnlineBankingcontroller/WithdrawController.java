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
import com.OnlineBanking.model.Withdraw;
import com.OnlineBanking.service.WithdrawService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class WithdrawController {

	@Autowired
	WithdrawService aService;

//http://localhost:8080/api/v1/getAllWithdraw
	@GetMapping("/getAllWithdraw")
	public List<Withdraw> getWithdraw() {
		List<Withdraw> aList = aService.fetchWithdraw();

		return aList;

	}

	// http://localhost:8080/api/v1/getdeposit/1
	@GetMapping("/getWithdraw/{transaction_id}")
	public ResponseEntity<Withdraw> getWithdrawById(@PathVariable("transaction_id") int transaction_id)
			throws ResourceNotFoundException{
		Withdraw a = aService.getWithdraw(transaction_id);
		return ResponseEntity.ok().body(a);
	}

	// http://localhost:8080/api/v1/saveWithdraw
	@PostMapping("/saveWithdraw")
	public Withdraw addWithdraw(@RequestBody Withdraw a) {

		Withdraw Withdraw = aService.saveWithdraw(a);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return Withdraw;
	}

	

//http://localhost:8080/api/v1/deleteWithdraw/1
	@DeleteMapping(value = "/deleteWithdraw/{transaction_id}")
	public ResponseEntity<Object> deleteWithdraw(@PathVariable("transaction_id") int transaction_id) {

		aService.deleteWithdraw(transaction_id);
		return new ResponseEntity<>("Withdraw deleted successsfully", HttpStatus.OK);
	}
	
}