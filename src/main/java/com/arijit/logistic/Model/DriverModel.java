package com.arijit.logistic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Driver_Details")
public class DriverModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="dlNumber")
	private String dlNumber;
	@Column(name="dlIssueDate")
	private String dlIssueDate;
	@Column(name="dlValidity")
	private String dlValidity;
	@Column(name="dob")
	private String dob;
	@Column(name="address")
	private String address;
	@Column(name="bloodGroup")
	private String bloodGroup;
	public DriverModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverModel(int id, String name, String dlNumber, String dlIssueDate, String dlValidity, String dob,
			String address, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.dlNumber = dlNumber;
		this.dlIssueDate = dlIssueDate;
		this.dlValidity = dlValidity;
		this.dob = dob;
		this.address = address;
		this.bloodGroup = bloodGroup;
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
	public String getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(String dlNumber) {
		this.dlNumber = dlNumber;
	}
	public String getDlIssueDate() {
		return dlIssueDate;
	}
	public void setDlIssueDate(String dlIssueDate) {
		this.dlIssueDate = dlIssueDate;
	}
	public String getDlValidity() {
		return dlValidity;
	}
	public void setDlValidity(String dlValidity) {
		this.dlValidity = dlValidity;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Override
	public String toString() {
		return "DriverModel [id=" + id + ", name=" + name + ", dlNumber=" + dlNumber + ", dlIssueDate=" + dlIssueDate
				+ ", dlValidity=" + dlValidity + ", dob=" + dob + ", address=" + address + ", bloodGroup=" + bloodGroup
				+ "]";
	}
	

}
