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
import com.OnlineBanking.model.Recipient;
import com.OnlineBanking.service.RecipientService;

//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class RecipientController {
	@Autowired
	RecipientService sService;

//http://localhost:8080/api/v1/getAllUseraccount
	@GetMapping("/getAllRecipient")
	public List<Recipient> getUseraccount() {
		List<Recipient> sList = sService.fetchRecipient();

		return sList;

	}

	// http://localhost:8080/api/v1/saveUseraccount
	@PostMapping("/saveRecipient")
	public Recipient addRecipient(@RequestBody Recipient s) {

		Recipient recipient = sService.saveRecipient(s);

//		 return new ResponseEntity<>("Approved successsfully", HttpStatus.OK);
		return recipient;
	}

	
//http://localhost:8080/api/v1/deleteUseraccount/john
	@DeleteMapping(value = "/deleteRecipient/{U_NAME}")
	public ResponseEntity<Object> deleteRecipient(@PathVariable("U_NAME") String U_NAME) {

		sService.deleteRecipient(U_NAME);
		return new ResponseEntity<>("Transaction Report Deleted successsfully", HttpStatus.OK);
	}
	

}


