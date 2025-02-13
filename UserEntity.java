package com.indrayani.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userData")

public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_mobile")
	private String mobile;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_firstName")
	private String firstName;
	@Column(name = "user_lastName")
	private String lastName;
	@Column(name = "user_education")
	private String education;
	@Column(name = "user_city")
	private String city;
	@Column(name = "user_district")
	private String district;
	@Column(name = "user_state")
	private String state;
	@Column(name = "user_pinCode")
	private String pinCode;
	@Column(name = "user_fcmToken")
	private String fcmToken;
	@Column(name = "user_address")
	private String address;
	@Column(name = "user_optedClasses")
	private String optedClasses;
	@Column(name = "user_role")
	private String role;
	@Column(name = "user_isActive")
	private String isActive;
	@Column(name = "user_updated")
	private String updated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getoptedClasses() {
		return optedClasses;
	}

	public void setoptedClasses(String optedClasses) {
		this.optedClasses = optedClasses;
	}

	public String getrole() {
		return role;
	}

	public void setrole(String role) {
		this.role = role;
	}

	public String getisActive() {
		return isActive;
	}

	public void setisActive(String isActive) {
		this.isActive = isActive;
	}

	public String getupdated() {
		return updated;
	}

	public void setupdated(String updated) {
		this.updated = updated;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteducation() {
		return education;
	}

	public void seteducation(String education) {
		this.education = education;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getdistrict() {
		return district;
	}

	public void setdistrict(String district) {
		this.district = district;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getpinCode() {
		return pinCode;
	}

	public void setpinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getfcmToken() {
		return fcmToken;
	}

	public void setfcmToken(String fcmToken) {
		this.fcmToken = fcmToken;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public UserEntity(Long id, String mobile, String email, String firstName, String lastName, String education,
			String city, String district, String state, String pinCode, String fcmToken, String address,
			String optedClasses, String role, String isActive, String updated) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.education = education;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
		this.fcmToken = fcmToken;
		this.address = address;
		this.optedClasses = optedClasses;
		this.role = role;
		this.isActive = isActive;
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", mobile=" + mobile + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", education=" + education + ", city=" + city + ", district=" + district
				+ ", state=" + state + ", pinCode=" + pinCode + ", fcmToken=" + fcmToken + ", address=" + address
				+ ", optedClasses=" + optedClasses + ", role=" + role + ", isActive=" + isActive + ", updated="
				+ updated + "]";
	}

	public UserEntity() {
		super();
	}

	public void setid(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
