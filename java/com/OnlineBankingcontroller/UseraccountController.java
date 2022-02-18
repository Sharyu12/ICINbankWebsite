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
import com.OnlineBanking.model.Useraccount;
import com.OnlineBanking.service.UseraccountService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UseraccountController {
	@Autowired
	UseraccountService sService;

//http://localhost:8080/api/v1/getAllUseraccount
	@GetMapping("/getAllUseraccount")
	public List<Useraccount> getUseraccount() {
		List<Useraccount> sList = sService.fetchUseraccount();

		return sList;

	}

	// http://localhost:8080/api/v1/saveUseraccount
	@PostMapping("/saveUseraccount")
	public Useraccount addTransaction(@RequestBody Useraccount s) {

		Useraccount useraccount = sService.saveUseraccount(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return useraccount;
	}

	
//http://localhost:8080/api/v1/deleteUseraccount/john
	@DeleteMapping(value = "/deleteUseraccount/{U_NAME}")
	public ResponseEntity<Object> deleteTransaction(@PathVariable("U_NAME") String U_NAME) {

		sService.deleteUseraccount(U_NAME);
		return new ResponseEntity<>("Transaction Report Deleted successsfully", HttpStatus.OK);
	}
	

}


