package com.example.loan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.loan.entity.AcOpening;

public interface AcOpeningRepository extends JpaRepository<AcOpening, Integer> {
	@Query(value="select * from customer_details where account_number=?  ",nativeQuery=true)
	Optional<AcOpening> getAccount(Long acnumber);

}
