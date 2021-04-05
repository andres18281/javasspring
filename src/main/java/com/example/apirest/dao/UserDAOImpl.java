package com.example.apirest.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.apirest.entity.User;
@Repository
public class UserDAOImpl implements UserDao{

	@PersistenceContext
    private EntityManager entityManager;
	
	
    @Override
    public List<User> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<User> theQuery = currentSession.createQuery("from entidad", User.class);

        List<User> users = theQuery.getResultList();

        return users;

    }

    @Override
    public User findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        User user = currentSession.get(User.class, id);

        return user;
    }

    @Override
    public void save(User user) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(user);  

    }

    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<User> theQuery = currentSession.createQuery("delete from entidad where id=:idUser");

        theQuery.setParameter("idUser", id);
        theQuery.executeUpdate();

    }


}
