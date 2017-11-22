package com.model;

/**
 * class UserDetails holds personal details of users.
 * 
 * @author vijaya meghana
 *
 */
public class UserDetails {

	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobileNumber;
	private String gender;

	/**
	 * this is default constructor.
	 */
	public UserDetails() {

	}

	/**
	 * parameterized constructor.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 * @param password
	 * @param mobileNumber
	 * @param gender
	 */
	public UserDetails(String firstName, String lastName, String emailId, String password, String mobileNumber,
			String gender) {
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.gender = gender;
	}

/**
 * getter method of first name.
 * @return firstname
 */
	public String getFirstName() {
		return firstName;

	/**
	 * setter method of firstname.
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getter method of lastname. * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setter method of lastname.
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getter method of email.
	 * 
	 * @return emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * setter method of emailId.
	 * 
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * getter method of password.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setter method of password.
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * getter method of mobileNumber.
	 * 
	 * @return mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * setter method of mobileNumber.
	 * 
	 * @param mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * getter method of gender.
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * setter method of gender.
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

}
