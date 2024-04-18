package com.arijit.logistic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.logistic.Model.ContactUsModel;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsModel, String> {

}
