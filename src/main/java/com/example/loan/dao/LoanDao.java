package com.example.loan.dao;

import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.example.loan.entity.LoanForm;
import com.example.loan.entity.Login;
import com.example.loan.entity.SignUp;
import com.example.loan.repository.LoanRepository;
import com.example.loan.repository.SignupRepository;

@Repository
public class LoanDao {
	@Autowired
	LoanRepository loanr;
	@Autowired
	SignupRepository signsrepo;
	@Autowired
	PasswordEncoder encoder;

	public LoanForm postform(LoanForm loan) {

		return loanr.save(loan);
	}

	public List<LoanForm> getAllDetails() {

		return loanr.findAll();
	}

	public SignUp signupUser(SignUp user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return signsrepo.save(user);
	}

	public List<LoanForm> getPersonByName(String name) {

		return loanr.getPersonByName(name);
	}

	public SignUp checkLogin(Login custom) throws DataFormatException, IOException {
		SignUp user = signsrepo.findByName(custom.getName());

		if (user != null && encoder.matches(custom.getPassword(), user.getPassword())) {
			return user;
		} else {
			user = null;
		}
		return user;
	}

	

}
