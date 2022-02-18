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
import com.OnlineBanking.model.Savingaccount;
import com.OnlineBanking.service.SavingaccountService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class SavingaccountController {
	@Autowired
	SavingaccountService sService;

//http://localhost:8080/api/v1/Savingaccount
	@GetMapping("/getAllSavingaccount")
	public List<Savingaccount> getSavingaccount() {
		List<Savingaccount> sList = sService.fetchSavingaccount();

		return sList;

	}

	// http://localhost:8080/api/v1/Saving
	@PostMapping("/SavingAccount")
	public Savingaccount addSavingaccount(@RequestBody Savingaccount s) {

		Savingaccount savingaccount = sService.saveSavingaccount(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return savingaccount;
	}

}


