package com.arijit.logistic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.logistic.Model.DriverModel;
@Repository
public interface DriverRepo extends JpaRepository<DriverModel, Integer> {

}
