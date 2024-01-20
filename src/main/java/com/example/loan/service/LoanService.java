package com.example.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.dao.LoanDao;
import com.example.loan.entity.LoanForm;
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

}
