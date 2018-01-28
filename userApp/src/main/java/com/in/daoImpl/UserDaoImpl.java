package com.in.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in.user.Users;

@Repository
@Transactional
public class UserDaoImpl {
	
	@Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(Users users) {
        session.getCurrentSession().saveOrUpdate(users);
        return true;
    }
 
    public List<Users> list() {
        return session.getCurrentSession().createQuery("from USERS").list();
    }
 
    public boolean delete(Users users) {
        try {
            session.getCurrentSession().delete(users);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}
