package com.example.loan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "customer_details")
public class AcOpening {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private String prefix;

	private String firstname;

	private String lastname;

	private String month;

	private int day;

	private int year;

	private String mothersmaidenName;

	private long telephoneNumber;

	private String email;

	private String streetAddress;

	private String streetAddressLine2;

	private String city;

	private String state;

	private int pincode;

	private String country;

	private String educationLevel;

	private String formofIdentification;

	@Column(columnDefinition = "MEDIUMTEXT")

	private String uploadId;

	private String accountType;

	private String accountCategory;
	private long accountNumber;
	private double balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	private int monthlySalary;

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getPrefix() {

		return prefix;

	}

	public void setPrefix(String prefix) {

		this.prefix = prefix;

	}

	public String getFirstname() {

		return firstname;

	}

	public void setFirstname(String firstname) {

		this.firstname = firstname;

	}

	public String getLastname() {

		return lastname;

	}

	public void setLastname(String lastname) {

		this.lastname = lastname;

	}

	public String getMonth() {

		return month;

	}

	public void setMonth(String month) {

		this.month = month;

	}

	public int getDay() {

		return day;

	}

	public void setDay(int day) {

		this.day = day;

	}

	public int getYear() {

		return year;

	}

	public void setYear(int year) {

		this.year = year;

	}

	public String getMothersmaidenName() {

		return mothersmaidenName;

	}

	public void setMothersmaidenName(String mothersmaidenName) {

		this.mothersmaidenName = mothersmaidenName;

	}

	public long getTelephoneNumber() {

		return telephoneNumber;

	}

	public void setTelephoneNumber(long telephoneNumber) {

		this.telephoneNumber = telephoneNumber;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getStreetAddress() {

		return streetAddress;

	}

	public void setStreetAddress(String streetAddress) {

		this.streetAddress = streetAddress;

	}

	public String getStreetAddressLine2() {

		return streetAddressLine2;

	}

	public void setStreetAddressLine2(String streetAddressLine2) {

		this.streetAddressLine2 = streetAddressLine2;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	public String getState() {

		return state;

	}

	public void setState(String state) {

		this.state = state;

	}

	public int getPincode() {

		return pincode;

	}

	public void setPincode(int pincode) {

		this.pincode = pincode;

	}

	public String getCountry() {

		return country;

	}

	public void setCountry(String country) {

		this.country = country;

	}

	public String getEducationLevel() {

		return educationLevel;

	}

	public void setEducationLevel(String educationLevel) {

		this.educationLevel = educationLevel;

	}

	public String getFormofIdentification() {

		return formofIdentification;

	}

	public void setFormofIdentification(String formofIdentification) {

		this.formofIdentification = formofIdentification;

	}

	public String getUploadId() {

		return uploadId;

	}

	public void setUploadId(String uploadId) {

		this.uploadId = uploadId;

	}

	public String getAccountType() {

		return accountType;

	}

	public void setAccountType(String accountType) {

		this.accountType = accountType;

	}

	public String getAccountCategory() {

		return accountCategory;

	}

	public void setAccountCategory(String accountCategory) {

		this.accountCategory = accountCategory;

	}

	public int getMonthlySalary() {

		return monthlySalary;

	}

	public void setMonthlySalary(int monthlySalary) {

		this.monthlySalary = monthlySalary;

	}

}
