package com.hcl.cs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User1;



@Repository
public class UserDaoImpl1 implements UserDao1{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User1 use) {
		
		sessionFactory.getCurrentSession().save(use);
		
	}

	@Override
	public Object authenticateUser(User1 user) {
		Query q=sessionFactory.getCurrentSession()
			.createQuery("select userName,userPassword from User1 where userName=:name and userPassword=:password");
	    q.setString("name",user.getUserName());
		q.setString("password", user.getUserPassword());
		Object str=q.uniqueResult();
		return str;
		
	}

	@Override
	public List<Pet> fetchAllPet() {
		Query query=sessionFactory.getCurrentSession().createQuery("select p from Pet p");
		List plist=query.list();
		return plist;
	}

	@Override
	public void savePet(Pet pets) {
		
		sessionFactory.getCurrentSession().save(pets);
		
	}

	

	
}
