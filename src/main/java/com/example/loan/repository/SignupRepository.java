package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.entity.SignUp;

public interface SignupRepository extends JpaRepository<SignUp, Integer>{

	SignUp findByName(String name);

}
