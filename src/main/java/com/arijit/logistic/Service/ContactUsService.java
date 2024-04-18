package com.arijit.logistic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.logistic.Model.ContactUsModel;
import com.arijit.logistic.Repo.ContactUsRepo;

@Service
public class ContactUsService {
	@Autowired
ContactUsRepo contactUsRepo;
	public void addAllData(ContactUsModel contactUsModel)
	{
		contactUsRepo.save(contactUsModel);
	}
	public List<ContactUsModel> listOfMessages()
	{
		return contactUsRepo.findAll();
	}
}
