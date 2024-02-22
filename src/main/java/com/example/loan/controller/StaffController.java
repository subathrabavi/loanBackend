package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.entity.Staff;
import com.example.loan.service.Staffservice;

@RestController
@RequestMapping(value="/staff")
//@CrossOrigin(origins="*")
public class StaffController {
	
	
	@Autowired
	Staffservice srvc;
	@PostMapping(value="/post")
	public Staff insert(@RequestBody Staff s) {
		return srvc.insert(s);
	}
	
	@GetMapping(value="/getAll")
	public List<Staff> get(){
		return srvc.get();
	}
	
	@GetMapping(value="/get/{m}")
	public Staff getbyid(@PathVariable Long m) {
		return srvc.getbyid(m);
	}
	
	@DeleteMapping(value="delete/{m}")
	public Staff delete(@PathVariable Long m) {
		return srvc.delete(m);
	}
@PutMapping(value="/put/{m}")
public Staff put(@PathVariable Long m, @RequestBody Staff s) {
	return srvc.put(m,s);
}

//@GetMapping(value="/getdt")
//public List<Staff> getdetails(){
//	return srvc.getdetails();
//}

	

}
