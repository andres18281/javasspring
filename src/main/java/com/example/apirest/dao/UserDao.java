package com.example.apirest.dao;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.apirest.entity.User;
@Component
public interface UserDao {
	 public List<User> findAll();

	 public User findById(int id);

	 public  void save(User user);

	 public void deleteById(int id);
}
