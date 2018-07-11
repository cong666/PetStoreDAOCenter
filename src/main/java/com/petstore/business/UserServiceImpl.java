package com.petstore.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petstore.model.PetStoreUser;
import com.petstore.repositories.UserRepository;
import com.petstore.repositories.UserRepositoryHelper;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	//spring JPA implementation
	@Autowired
	private UserRepositoryHelper userRepository;
	
	//use entity JPA entity manager
	@Autowired
	private UserRepository userRepositoryPU;

	@Override
	public PetStoreUser findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public PetStoreUser findById(Long id) {
		//Optional<PetStoreUser> userOptional = userRepository.findById(id);
		//return userOptional.get();
		return userRepositoryPU.findById(id);
	}

	@Override
	public void createUser(PetStoreUser user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(PetStoreUser user) {
		userRepository.delete(user);
		
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public PetStoreUser updateUser(PetStoreUser user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
		
	}

	@Override
	public List<PetStoreUser> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean isUserExist(PetStoreUser user) {
		PetStoreUser u = userRepository.findByName(user.getName());
		if(u!=null) {
			return true;
		}
		return false;
	}

}
