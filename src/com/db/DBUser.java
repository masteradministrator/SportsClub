package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;


public class DBUser implements java.io.Serializable {
	
	private long memberID;
	private String firstname ;
	private String surname;
	private String email;
	private String phoneNo;
	private String gender;
	private String altPhoneNo;
	private String address;
	private String area;
	private String city;
	private int pinCode;
	private Date dob;
	private Date createdDate;
	private Date lastPaymentDate;
	private Date membershipExpiryDate;
	private String subscriptionType;
	private String membershipDetails;
	private String paymentType;
	private int amountPaid;
	
	private String name1;
	private String relationship1;
	private String gender1;
	private String name2;
	private String relationship2;
	private String gender2;
	private String name3;
	private String relationship3;
	private String gender3;
	private String name4;
	private String relationship4;
	private String gender4;
	private String name5;
	private String relationship5;
	private String gender5;
	
	public Date getMembershipExpiryDate() {
		return membershipExpiryDate;
	}

	public void setMembershipExpiryDate(Date membershipExpiryDate) {
		this.membershipExpiryDate = membershipExpiryDate;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getGender1() {
		return gender1;
	}

	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}

	public String getGender2() {
		return gender2;
	}

	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}

	public String getGender3() {
		return gender3;
	}

	public void setGender3(String gender3) {
		this.gender3 = gender3;
	}

	public String getGender4() {
		return gender4;
	}

	public void setGender4(String gender4) {
		this.gender4 = gender4;
	}

	public String getGender5() {
		return gender5;
	}

	public void setGender5(String gender5) {
		this.gender5 = gender5;
	}
	
	public DBUser() {
	}

	public long getMemberID() {
		return memberID;
	}

	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAltPhoneNo() {
		return altPhoneNo;
	}

	public void setAltPhoneNo(String altPhoneNo) {
		this.altPhoneNo = altPhoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public String getMembershipDetails() {
		return membershipDetails;
	}

	public void setMembershipDetails(String membershipDetails) {
		this.membershipDetails = membershipDetails;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getRelationship1() {
		return relationship1;
	}

	public void setRelationship1(String relationship1) {
		this.relationship1 = relationship1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getRelationship2() {
		return relationship2;
	}

	public void setRelationship2(String relationship2) {
		this.relationship2 = relationship2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getRelationship3() {
		return relationship3;
	}

	public void setRelationship3(String relationship3) {
		this.relationship3 = relationship3;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getRelationship4() {
		return relationship4;
	}

	public void setRelationship4(String relationship4) {
		this.relationship4 = relationship4;
	}

	public String getName5() {
		return name5;
	}

	public void setName5(String name5) {
		this.name5 = name5;
	}

	public String getRelationship5() {
		return relationship5;
	}

	public void setRelationship5(String relationship5) {
		this.relationship5 = relationship5;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public DBUser(long memberID, String firstname, String surname, String email, String phoneNo, String gender,
			String altPhoneNo, String address, String area, String city, int pinCode, Date dob, Date createdDate,
			Date lastPaymentDate, Date membershipExpiryDate, String subscriptionType, String membershipDetails,
			String paymentType, int amountPaid, String name1, String relationship1, String gender1, String name2,
			String relationship2, String gender2, String name3, String relationship3, String gender3, String name4,
			String relationship4, String gender4, String name5, String relationship5, String gender5) {
		super();
		this.memberID = memberID;
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.altPhoneNo = altPhoneNo;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pinCode = pinCode;
		this.dob = dob;
		this.createdDate = createdDate;
		this.lastPaymentDate = lastPaymentDate;
		this.membershipExpiryDate = membershipExpiryDate;
		this.subscriptionType = subscriptionType;
		this.membershipDetails = membershipDetails;
		this.paymentType = paymentType;
		this.amountPaid = amountPaid;
		this.name1 = name1;
		this.relationship1 = relationship1;
		this.gender1 = gender1;
		this.name2 = name2;
		this.relationship2 = relationship2;
		this.gender2 = gender2;
		this.name3 = name3;
		this.relationship3 = relationship3;
		this.gender3 = gender3;
		this.name4 = name4;
		this.relationship4 = relationship4;
		this.gender4 = gender4;
		this.name5 = name5;
		this.relationship5 = relationship5;
		this.gender5 = gender5;
	}



}
