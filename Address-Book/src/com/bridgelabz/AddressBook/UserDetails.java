package com.bridgelabz.AddressBook;

public class UserDetails {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String mobileNo;
	private String email;
	public UserDetails(String firstName, String lastName,String address, String city, String state, String zip, String mobileNo,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobileNo = mobileNo;
		this.email = email;
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
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip() {
		return zip;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + " lastName=" + lastName +
				"Address = "+address+" city=" + city + " state=" + state
				+ ", zipCode=" + zip + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
}

