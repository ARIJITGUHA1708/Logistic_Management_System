package com.arijit.logistic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NewUser")
public class NewUser {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name", nullable = false, updatable = true)
	private String name;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "mobile", nullable = false)
	private long mobile;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;

	public NewUser() {
		super();

	}

	public NewUser(int id, String name, String email, long mobile, String address, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "NewUser [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", username=" + username + ", password=" + password + "]";
	}

}
