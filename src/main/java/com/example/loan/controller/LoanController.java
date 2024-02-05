package com.example.loan.controller;

import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.entity.AcOpening;
import com.example.loan.entity.LoanForm;
import com.example.loan.entity.Login;
import com.example.loan.entity.SignUp;
import com.example.loan.service.LoanService;

@RestController
@CrossOrigin(origins = "*")
public class LoanController {

	@Autowired
	LoanService loans;
 
	@PostMapping(value = "/postForm")
	public LoanForm postform(@RequestBody LoanForm loan) {
		return loans.postform(loan);
	}

	@GetMapping(value = "/getAll")
	public List<LoanForm> getAllDetails() {
		return loans.getAllDetails();
	}

	@GetMapping(value = "/getByName/{name}")
	public List<LoanForm> getPersonByName(@PathVariable String name) {
		return loans.getPersonByName(name);
	}
	
	
	
	
	
	@PostMapping(value="/sign")
	public SignUp signupUser(@RequestBody SignUp user) {
		return loans.signupUser(user);
	}
	
	
	
	
	@PostMapping(value = "/log")
	public SignUp checkLogin(@RequestBody Login custom) throws DataFormatException, IOException {
   return loans.checkLogin(custom);
 }

	
	
	
	
	
}
