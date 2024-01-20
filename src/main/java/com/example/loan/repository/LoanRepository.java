package com.example.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.loan.entity.LoanForm;

public interface LoanRepository extends JpaRepository<LoanForm, Integer> {
	
	@Query(value="select * from loanform where firstname like ?%",nativeQuery=true)
	public List<LoanForm> getPersonByName(String name);
}
