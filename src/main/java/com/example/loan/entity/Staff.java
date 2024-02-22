package com.example.loan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="staff_details")


public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String mothername;
	private String dob;
	private String gender;
    private String bloodgroup;
	private String dno;
	private String street;
	private String city;
	private int pincodde;
	private String email;
	private int contact;
	private String naminie;
	private String emergency_contact;
	private String marital_status;
	private String qualification;
	private int passedout;
	private String extraskils;
	private String job_roll;
	private String experiencce;
	private String signature;
	private String submitdate;
	
	@Column(columnDefinition="MEDIUMTEXT")
	private String image;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincodde() {
		return pincodde;
	}
	public void setPincodde(int pincodde) {
		this.pincodde = pincodde;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getNaminie() {
		return naminie;
	}
	public void setNaminie(String naminie) {
		this.naminie = naminie;
	}
	public String getEmergency_contact() {
		return emergency_contact;
	}
	public void setEmergency_contact(String emergency_contact) {
		this.emergency_contact = emergency_contact;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getPassedout() {
		return passedout;
	}
	public void setPassedout(int passedout) {
		this.passedout = passedout;
	}
	public String getExtraskils() {
		return extraskils;
	}
	public void setExtraskils(String extraskils) {
		this.extraskils = extraskils;
	}
	public String getJob_roll() {
		return job_roll;
	}
	public void setJob_roll(String job_roll) {
		this.job_roll = job_roll;
	}
	public String getExperiencce() {
		return experiencce;
	}
	public void setExperiencce(String experiencce) {
		this.experiencce = experiencce;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSubmitdate() {
		return submitdate;
	}
	public void setSubmitdate(String submitdate) {
		this.submitdate = submitdate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
