package com.arijit.logistic.Model;

public class MainAdminLoginDetails {
	private String username;
	private String password;

	public MainAdminLoginDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public MainAdminLoginDetails() {
		super();
		// TODO Auto-generated constructor stub
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
		return "MainAdminLoginDetails [username=" + username + ", password=" + password + "]";
	}

}
