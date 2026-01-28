package com.assign1.model;

//import java.sql.Date; not used atm

/*
 * Assignment 1 (Part A)
 * @author - Kenny Thach #200524650
 * @date - January 17th, 2026		
 * Description - This is model class for the form 
 * 
 */

public class RegistrationForm {
	
	private String userName;
	private String password; // not a secure method of storing password
	private String name;
	private String address;
	private String country;
	private String postalCode;
	private String email;
	private int sex; 		// will use 0 for male 1 for female
	private int language; 	// 0 for English and 1 for "Non English"
	private String about;

	/*
	 * Getters and setters (I used auto generate in Eclipse to create)
	 */

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}


}
