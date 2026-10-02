package com.example.usermanagement.demo.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.demo.entities.User;
import com.example.usermanagement.demo.repositories.UserRepo;
import com.example.usermanagement.demo.services.UserService;



@Service
public class UserServiceImp implements UserService {


	@Autowired
	UserRepo userRepo;

	@Override

	public List<User> getDataList(String keyWords) {
		// TODO Auto-generated method stub
		return userRepo.getTableList(keyWords);
	}

	@Override
	public List<User> saveData(List<User> user) {
		// TODO Auto-generated method stub
		userRepo.saveAll(user);
		return user;
	}

}
