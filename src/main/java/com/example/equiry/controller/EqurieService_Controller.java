package com.example.equiry.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.equiry.model.EnquiryDetails;
import com.example.equiry.serviceI.EquiryInterface;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EqurieService_Controller {

    @Autowired
    private EquiryInterface enquiryService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/enquiry")
    public String createEnquiry(
            @RequestPart("info") String enquiryJsonData,
            @RequestPart("prof") MultipartFile profileImage,
            @RequestPart("adhar") MultipartFile aadharDocument,
            @RequestPart("pan") MultipartFile panDocument) {

        try {
            EnquiryDetails enquiryDetails = objectMapper.readValue(enquiryJsonData, EnquiryDetails.class);

            enquiryDetails.setProfileImage(profileImage.getBytes());
            enquiryDetails.setAadharCard(aadharDocument.getBytes());
            enquiryDetails.setPanCard(panDocument.getBytes());

            enquiryService.saveEnquiry(enquiryDetails);

            return "Enquiry Registration Successfully Completed!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred while processing the enquiry.";
        }
        
       
    }
    // Handle GET request to retrieve an enquiry by ID
    @GetMapping("/enquiry")
    public EnquiryDetails getEnquiry(@RequestParam int enquiryId) {
        return enquiryService.getEnquiryById(enquiryId);
    }
}
