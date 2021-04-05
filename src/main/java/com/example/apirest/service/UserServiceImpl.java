package com.example.apirest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.apirest.dao.UserDAOImpl;
import com.example.apirest.dao.UserDao;
import com.example.apirest.entity.User;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDAOImpl userDAO;

	@Override
    public List<User> findAll() {
        List<User> listUsers= userDAO.findAll();
        return listUsers;
    }

    @Override
    public User findById(int id) {
        User user = userDAO.findById(id);
        return user;
    }
    
    @Override
    public void save(User user) {
        userDAO.save(user);

    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }
}
