package com.arijit.logistic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.logistic.Model.VehicleModel;
@Repository
public interface VehicleRepo extends JpaRepository<VehicleModel, Integer> {

}
