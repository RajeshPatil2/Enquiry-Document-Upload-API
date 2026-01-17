package com.example.equiry.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class EnquiryDetails {

	@Id
	private int enquiryId;
	private String fullName;
	private String address;
	private String email;
	private int age;
	private String panNumber;

	@Lob /**
			 * Specifies that a persistent property or field should be persistedas a large
			 * object to a database-supported large object type.
			 */
	@Column(length = 999999999)
	private byte[] profileImage;

	@Lob
	@Column(length = 999999999)
	private byte[] aadharCard;

	@Lob
	@Column(length = 999999999)
	private byte[] panCard;

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public byte[] getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}

	public byte[] getPanCard() {
		return panCard;
	}

	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}

}
