package com.example.usermanagement.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.usermanagement.demo.entities.User;


@Service
public interface UserService {

	public List<User> getDataList(String keyWords);
	
	
	public List<User> saveData(List<User> user);

}
