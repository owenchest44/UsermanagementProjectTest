package com.example.usermanagement.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermanagement.demo.entities.User;
import com.example.usermanagement.demo.services.UserService;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan
@Component
public class UserApiController {


	


	@Autowired
     UserService  userService;




	  @Autowired
	  @Value("${spring.jpa.properties.hibernate.dialect}")
	  private   String password1;

	@RequestMapping("/")
	public String hello()
	{
		return "Hello javaTpoint555";
	}

	@PostMapping(value="/showData", consumes = "application/json", produces = "application/json")
	public List<User> showData(@RequestBody User param1)
	{





		List<String> list1=new ArrayList<>();

		List<User> listUser=new ArrayList<>();

		


		listUser=userService.getDataList("");

		return listUser;
	}
	
	
	
	
	@PostMapping(value="/showData", consumes = "application/json", produces = "application/json")
	public List<User> saveData(@RequestBody User param1)
	{





		List<String> list1=new ArrayList<>();

		List<User> listUser=new ArrayList<>();

		


		userService.saveData(listUser);

		return listUser;
	}
	

}
