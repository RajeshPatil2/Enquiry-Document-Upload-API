package com.example.equiry.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.equiry.model.EnquiryDetails;
import com.example.equiry.repository.EquiryRepository;
import com.example.equiry.serviceI.EquiryInterface;



@Service
public class EnquiryServiceImpl implements EquiryInterface {

    @Autowired
    EquiryRepository enquiryRepository;

    @Override
    public EnquiryDetails saveEnquiry(EnquiryDetails enquiry) {
        return enquiryRepository.save(enquiry);
    }
    
    @Override
    public EnquiryDetails getEnquiryById(int enquiryId) {
        return enquiryRepository.findById(enquiryId).orElse(null);
    }
}
