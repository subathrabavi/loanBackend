package com.example.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
