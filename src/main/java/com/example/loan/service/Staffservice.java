package com.example.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.dao.StaffDao;
import com.example.loan.entity.Staff;

@Service

public class Staffservice {
	
@Autowired
	
	StaffDao sdao;
	public Staff insert(Staff s) {
		return sdao.insert(s);
	}
	public List<Staff> get() {
		
		return sdao.get();
	}
	public Staff getbyid(Long m) {
		
		return sdao.getbyid(m);
	}
	public Staff delete(Long m) {
		
		return sdao.delete(m);
	}
	public Staff put(Long m, Staff s) {
		
		return sdao.put(m,s);
	}
	
//	public List<Staff> getdetails() {
//		
//		return sdao.getdetails();
//	}
//	


}
