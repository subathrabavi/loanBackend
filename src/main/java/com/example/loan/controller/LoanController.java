package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.entity.LoanForm;
import com.example.loan.service.LoanService;

@RestController
@CrossOrigin(origins = "*")
public class LoanController {
	
	@Autowired
	LoanService loans;
	
	@PostMapping(value="/postForm")
	public LoanForm postform(@RequestBody LoanForm loan ) {
		return loans.postform(loan);
	}
	@GetMapping(value="/getAll")
	public List<LoanForm> getAllDetails(){
		return loans.getAllDetails();
	}
	@GetMapping(value="/getByName/{name}")
	public List<LoanForm> getPersonByName(@PathVariable String name){
		return loans.getPersonByName(name);
	}

}
