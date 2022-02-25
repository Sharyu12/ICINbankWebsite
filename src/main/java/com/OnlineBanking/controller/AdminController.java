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
import com.OnlineBanking.model.Admin;
import com.OnlineBanking.service.AdminService;



@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class AdminController {
	@Autowired
	AdminService aService;
	//http://localhost:8090/api/v1/loginUser
		@PostMapping("/loginUser")
		public ResponseEntity<Object> validateUser(@RequestBody Admin user) 		
		{
			Admin a = aService.validateUser(user);
			if (a==null)
			
			return new ResponseEntity<>("Invalid credentials",HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<>("Successful login", HttpStatus.OK);
		}
	
//http://localhost:8080/api/v1/getAllAdmins
	@GetMapping("/getAllAdmins")
	public List<Admin> getAdmins() {
		List<Admin> aList = aService.fetchAdmins();

		return aList;

	}

	
}
//alter table adminapp drop column ad_id