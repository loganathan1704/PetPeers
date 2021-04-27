package com.hcl.cs.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cs.dao.UserDao1;
import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User1;


@Service
@Transactional
public class UserServiceImpl1 implements UserService1{

	@Autowired
	private UserDao1 userDao1;
	
	@Override
	public void saveUser(User1 use) {
		
		userDao1.saveUser(use);
	}


	@Override
	public Object authenticateUser(User1 user) {
		
		Object user1=userDao1.authenticateUser(user);
		return user1;
		
		
		
	}


	@Override
	public List<Pet> fetchAllPet() {
		List<Pet> petlist=userDao1.fetchAllPet();
		return petlist;
		
	}


	@Override
	public void savePet(Pet pets) {
		
		userDao1.savePet(pets);
		
	}


}
