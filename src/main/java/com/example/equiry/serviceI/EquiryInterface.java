package com.example.equiry.serviceI;

import com.example.equiry.model.EnquiryDetails;

public interface  EquiryInterface{

    EnquiryDetails saveEnquiry(EnquiryDetails enquiryDetails);
    
    EnquiryDetails getEnquiryById(int enquiryId);
}
