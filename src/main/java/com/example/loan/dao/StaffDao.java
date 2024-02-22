package com.example.loan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.loan.entity.AcOpening;
import com.example.loan.entity.Staff;
import com.example.loan.repository.StaffRepository;

@Repository

public class StaffDao {
	
	@Autowired

	StaffRepository srepo;

	public Staff insert(Staff s) {
		return srepo.save(s);
		
	}

	public List<Staff> get() {
	    return srepo.findAll();
	}

	public Staff getbyid(Long m) {
		return srepo.findById(m).get();
		 
	}

	public Staff delete(Long m) {
	     Staff a = srepo.findById(m).get();
           srepo.deleteById(m);
           return  a;
     
     

		
		 
	}

	public Staff put(Long m, Staff s) {
		srepo.findById(m).get();
		s.setId(m);
		return srepo.save(s);
	}


//	public List<Staff> getdetails() {
//		return srepo.getdetails();
//	}



}
