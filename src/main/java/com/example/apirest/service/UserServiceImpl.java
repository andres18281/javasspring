package com.example.apirest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.apirest.dao.UserDAOImpl;

import com.example.apirest.entity.User;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDAOImpl userimpledao;

	@Override
    public List<User> findAll() {
        List<User> listUsers= userimpledao.findAll();
        return listUsers;
    }

    @Override
    public User findById(int id) {
        User user = userimpledao.findById(id);
        return user;
    }
    
    @Override
    public void save(User user) {
    	userimpledao.save(user);

    }

    @Override
    public void deleteById(int id) {
    	userimpledao.deleteById(id);
    }
}
