package com.example.loan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loan.dao.AcOpeningDao;
import com.example.loan.entity.AcOpening;

@Service
public class AcOpeninngService {
	

	


		@Autowired

		AcOpeningDao acDao;


		public AcOpening postValue(AcOpening a) {

			// TODO Auto-generated method stub

			return acDao.postValue(a);

		}


		public List<AcOpening> find() {

			// TODO Auto-generated method stub

			return acDao.find();

		}


		public AcOpening getbyId(int id) {

			// TODO Auto-generated method stub

			return acDao.getbyId(id);

		}
		  public Optional<AcOpening> getAccount(Long acnumber) {
		        return acDao.getAccount(acnumber);
		    }
		  
		  public AcOpening deposit(Long acnumber, double amount) {
		        AcOpening account = getAccount(acnumber).orElseThrow(() -> new RuntimeException("Account not found"));
		        account.setBalance(account.getBalance() + amount);  
		        return acDao.deposit(account);
		    }
		  
		  
		  public AcOpening withdraw(Long acnumber, double amount) {
		        AcOpening account = getAccount(acnumber).orElseThrow(() -> new RuntimeException("Account not found"));
		        if (account.getBalance() < amount) {
		            throw new RuntimeException("Insufficient funds");
		        }
		        account.setBalance(account.getBalance() - amount);
		        return acDao.withdraw(account);
		    }

		public AcOpening deleteId(int id) {

			// TODO Auto-generated method stub

			return acDao.deleteId(id);

			

		}

		
}
