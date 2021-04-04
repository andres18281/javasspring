package com.axample.apirest.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.axample.apirest.entity.User;


public interface UserService {
    		
	 public List<User> findAll();

	 public User findById(int id);

	 public void save(User user);

	 public void deleteById(int id);
}
