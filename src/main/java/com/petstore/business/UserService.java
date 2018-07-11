package com.petstore.business;

import java.util.List;

import com.petstore.model.PetStoreUser;

public interface UserService {
	
	PetStoreUser findByName(String name);
	PetStoreUser findById(Long id);
	void createUser(PetStoreUser user);
	void deleteUser(PetStoreUser user);
	void deleteById(Long id);
	PetStoreUser updateUser(PetStoreUser user);
	
	void deleteAllUsers();

	List<PetStoreUser> findAllUsers();

	boolean isUserExist(PetStoreUser user);
}
