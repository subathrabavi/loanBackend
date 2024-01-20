package com.example.loan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.loan.entity.LoanForm;
import com.example.loan.repository.LoanRepository;
@Repository
public class LoanDao {
@Autowired
LoanRepository loanr;
	public LoanForm postform(LoanForm loan) {
		
		return loanr.save(loan);
	}
	public List<LoanForm> getAllDetails() {
		
		return loanr.findAll();
	}
	public List<LoanForm> getPersonByName(String name) {
		
		return loanr.getPersonByName(name);
	}

}
