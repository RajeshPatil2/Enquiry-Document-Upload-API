package com.example.equiry.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.equiry.model.EnquiryDetails;

@Repository
public interface EquiryRepository extends CrudRepository<EnquiryDetails, Integer>{

	
}
