package com.example.loan.service;


import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.dao.LoanDao;
import com.example.loan.entity.AcOpening;
import com.example.loan.entity.LoanForm;
import com.example.loan.entity.Login;
import com.example.loan.entity.SignUp;
@Service
public class LoanService {

	
	@Autowired
	LoanDao loand;
	
	
	public LoanForm postform(LoanForm loan) {
		
		return loand.postform(loan);
	}
	public List<LoanForm> getAllDetails() {
		
		return loand.getAllDetails();
	}
	public List<LoanForm> getPersonByName(String name) {
		return loand.getPersonByName(name);
		
	}
	
	
	public SignUp checkLogin(Login custom) throws DataFormatException, IOException {
		return loand.checkLogin(custom);
		
	}
	public SignUp signupUser(SignUp user) {
		return loand.signupUser(user);

	}
	
}