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
import com.OnlineBanking.model.deposit;
import com.OnlineBanking.service.depositService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class depositController {

	@Autowired
	depositService aService;

//http://localhost:8080/api/v1/getAlldeposits
	@GetMapping("/getAlldeposit")
	public List<deposit> getdeposit() {
		List<deposit> aList = aService.fetchdeposit();

		return aList;

	}

	// http://localhost:8080/api/v1/getdeposit/1
	@GetMapping("/getdeposit/{account_no}")
	public ResponseEntity<deposit> getdepositById(@PathVariable("account_no") int account_no)
			throws ResourceNotFoundException {
		deposit a = aService.getdeposit(account_no);
		return ResponseEntity.ok().body(a);
	}

	// http://localhost:8080/api/v1/savedeposit
	@PostMapping("/savedeposit")
	public deposit adddeposit(@RequestBody deposit a) {

		deposit deposit = aService.savedeposit(a);

		// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
		return deposit;
	}

	

//http://localhost:8080/api/v1/deletedeposit/1
	@DeleteMapping(value = "/deletedeposit/{account_no}")
	public ResponseEntity<Object> deletedeposit(@PathVariable("account_no") int account_no) {

		aService.deletedeposit(account_no);
		return new ResponseEntity<>("deposit deleted successsfully", HttpStatus.OK);
	}
	
}


