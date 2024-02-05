package com.example.loan.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.entity.AcOpening;
import com.example.loan.service.AcOpeninngService;

@RestController

@RequestMapping(value = "/acopening")

@CrossOrigin(origins = "*")
public class AcOpeninghController {

	@Autowired

	AcOpeninngService acSer;

	@PostMapping(value = "/post")

	public AcOpening postValue(@RequestBody AcOpening a) {

		return acSer.postValue(a);

	}

	@GetMapping(value = "/getall")

	public List<AcOpening> find() {

		return acSer.find();

	}

	@GetMapping(value = "/getid/{id}")

	public AcOpening getbyId(@PathVariable int id) {

		return acSer.getbyId(id);

	}
	
	   @GetMapping("/getAccount/{acnumber}")
	    public AcOpening getAccount(@PathVariable Long acnumber) {
	        return acSer.getAccount(acnumber).orElseThrow(() -> new RuntimeException("Account not found"));
	    }
	   
	   
	   @PostMapping("/deposit/{acnumber}")
	    public AcOpening deposit(@PathVariable Long acnumber, @RequestBody Map<String, Double> request) {
	        Double amount = request.get("amount");
	        return acSer.deposit(acnumber, amount);
	    }
	   
	   
	   @PostMapping("/withdraw/{acnumber}")
	    public AcOpening withdraw(@PathVariable Long acnumber, @RequestBody Map<String, Double> request) {
	        Double amount = request.get("amount");
	        return acSer.withdraw(acnumber, amount);
	    }

	@DeleteMapping(value = "/delete/{id}")

	public AcOpening deleteId(@PathVariable int id) {

		return acSer.deleteId(id);

	}

}
