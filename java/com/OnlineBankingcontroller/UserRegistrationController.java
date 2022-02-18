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
import com.OnlineBanking.model.UserRegistration;
import com.OnlineBanking.service.UserRegistrationService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController

public class UserRegistrationController {
	@Autowired
	UserRegistrationService regService;

//http://localhost:8088/api/v1/getAllUserRegistration
	@GetMapping("/getAllUserRegistration")
	public List<UserRegistration> getUsers() {
		List<UserRegistration> regList = regService.fetchUserRegistration();

		return regList;

	}
	// http://localhost:8088/api/v1/saveUserRegistration
		@PostMapping("/saveUserRegistration")
		public UserRegistration addUserRegistration(@RequestBody UserRegistration reg) {

			UserRegistration userregistration = regService.saveUserRegistration(reg);

			// return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
			return userregistration;
		}
		
		/*@PostMapping("/loginUser")*/
		@PostMapping("/loginUserRegistration")
		public UserRegistration validateUser(@RequestBody UserRegistration user) 		
		{
			System.out.println("in controller="+user.getUserName());
			UserRegistration u = regService.validateUser(user);
			return u;
			//if (u==null)
			
			//return new ResponseEntity<>("Invalid credentials",HttpStatus.NOT_FOUND);
			//else
				//return new ResponseEntity<>("Successful login", HttpStatus.OK);
			
		}

}
