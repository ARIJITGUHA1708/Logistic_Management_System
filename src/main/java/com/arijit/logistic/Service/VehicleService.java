package com.arijit.logistic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.logistic.Model.VehicleModel;
import com.arijit.logistic.Repo.VehicleRepo;

@Service
public class VehicleService {
	@Autowired
	VehicleRepo vehicleRepo;
public void AddVehicle(VehicleModel vehicleModel)
{
	vehicleRepo.save(vehicleModel);
}
public List<VehicleModel> ShowAllVehicle()
{
	return vehicleRepo.findAll();
}
}
