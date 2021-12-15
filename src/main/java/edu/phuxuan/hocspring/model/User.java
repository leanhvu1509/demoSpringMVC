package edu.phuxuan.hocspring.model;

public class User {
	private String fullName;
	private String birth;
	private String phone;
	private String address;

	public User() {
		super();
	}

	public User(String fullName, String birth, String phone, String address) {
		super();
		this.fullName = fullName;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
