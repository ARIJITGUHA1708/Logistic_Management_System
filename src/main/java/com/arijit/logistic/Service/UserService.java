package com.arijit.logistic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.logistic.Model.NewUser;
import com.arijit.logistic.Repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public void saveNewUser(NewUser newUser) {
		userRepo.save(newUser);
	}
}
