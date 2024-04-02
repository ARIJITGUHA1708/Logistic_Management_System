package com.arijit.logistic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.logistic.Model.NewUser;

@Repository
public interface UserRepo extends JpaRepository<NewUser, Integer> {

}
