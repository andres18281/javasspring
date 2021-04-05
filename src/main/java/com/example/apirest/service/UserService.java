package com.example.apirest.service;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.apirest.entity.User;

@Component
public interface UserService {
    		
	 public List<User> findAll();

	 public User findById(int id);

	 public void save(User user);

	 public void deleteById(int id);
}
