package com.arijit.logistic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.logistic.Model.DriverModel;
import com.arijit.logistic.Repo.DriverRepo;

@Service
public class DriverService {
	@Autowired
	DriverRepo driverRepo;
public void AddDriverDetails(DriverModel driverModel)
{
	driverRepo.save(driverModel);
}
public List<DriverModel> ShowAllDrivers()
{
	return driverRepo.findAll();
}
}
