package com.hcl.cs.service;

import java.util.List;

import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User1;

public interface UserService1 {

public void saveUser(User1 use);
	
public Object authenticateUser(User1 user);

public List<Pet> fetchAllPet();

public void savePet(Pet pets);
}
