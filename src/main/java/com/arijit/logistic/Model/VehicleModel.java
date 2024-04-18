package com.arijit.logistic.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehicle_Data")
public class VehicleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(name="companyName")
private String companyName;
	@Column(name="registrationNumber")
private String registrationNumber;
	@Column(name="registrationDate")
private String registrationDate;
	@Column(name="registrationValidity")
private String registrationValidity;
	@Column(name="manufacturingDate")
private String manufacturingDate;
	@Column(name="fuelType")
private String fuelType;
	@Column(name="ChassisNumber")
private String chassisNumber;
	@Column(name="loadCapacity")
private String loadCapacity;
	@Column(name="engineNumber")
private String engineNumber;
	@Column(name="ownerName")
private String ownerName;
	@Column(name="cubicCapacity")
private String cubicCapacity;
	public VehicleModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleModel(int id, String companyName, String registrationNumber, String registrationDate,
			String registrationValidity, String manufacturingDate, String fuelType, String chassisNumber,
			String loadCapacity, String engineNumber, String ownerName, String cubicCapacity) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.registrationValidity = registrationValidity;
		this.manufacturingDate = manufacturingDate;
		this.fuelType = fuelType;
		this.chassisNumber = chassisNumber;
		this.loadCapacity = loadCapacity;
		this.engineNumber = engineNumber;
		this.ownerName = ownerName;
		this.cubicCapacity = cubicCapacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getRegistrationValidity() {
		return registrationValidity;
	}
	public void setRegistrationValidity(String registrationValidity) {
		this.registrationValidity = registrationValidity;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	@Override
	public String toString() {
		return "AddVehicleModel [id=" + id + ", companyName=" + companyName + ", registrationNumber="
				+ registrationNumber + ", registrationDate=" + registrationDate + ", registrationValidity="
				+ registrationValidity + ", manufacturingDate=" + manufacturingDate + ", fuelType=" + fuelType
				+ ", chassisNumber=" + chassisNumber + ", loadCapacity=" + loadCapacity + ", engineNumber="
				+ engineNumber + ", ownerName=" + ownerName + ", cubicCapacity=" + cubicCapacity + "]";
	}
	
}
