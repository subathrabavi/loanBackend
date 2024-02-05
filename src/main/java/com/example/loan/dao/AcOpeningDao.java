package com.example.loan.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.loan.entity.AcOpening;
import com.example.loan.repository.AcOpeningRepository;

@Repository
public class AcOpeningDao {

	@Autowired
	AcOpeningRepository acRepo;

	public AcOpening postValue(AcOpening a) {
// TODO Auto-generated method stub
		return acRepo.save(a);
	}

	public List<AcOpening> find() {
// TODO Auto-generated method stub
		return acRepo.findAll();
	}

	public AcOpening getbyId(int id) {
// TODO Auto-generated method stub
		return acRepo.findById(id).get();
	}

	public AcOpening deleteId(int id) {
// TODO Auto-generated method stub
		AcOpening a = acRepo.findById(id).get();
		acRepo.deleteById(id);
		return a;

	}

	public Optional<AcOpening> getAccount(Long acnumber) {
		
		return acRepo.getAccount(acnumber);
	}

	public AcOpening deposit(AcOpening account) {
		// TODO Auto-generated method stub
		return acRepo.save(account);
	}

	public AcOpening withdraw(AcOpening account) {
		
		return acRepo.save(account);
	}

	
}
