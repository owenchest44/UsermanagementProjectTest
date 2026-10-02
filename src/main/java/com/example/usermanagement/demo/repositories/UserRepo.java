package com.example.usermanagement.demo.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.usermanagement.demo.entities.User;

import jakarta.transaction.Transactional;



@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	@Override
	List<User> findAll();
	
	
	@Transactional
	  @Modifying      // to mark delete or update query
	    @Query(value = "SELECT * from user where name like :keyWords%)  ",nativeQuery = true)      
	    List<User> getTableList(@Param("keyWords") String keyWords);
	
	

	
	
}
