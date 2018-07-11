package com.petstore.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petstore.model.PetStoreUser;

@Repository
@Transactional
public class UserRepository {
	@PersistenceContext
	private EntityManager em;
	
	public PetStoreUser findById(Long id) {
		return (PetStoreUser)em.find(PetStoreUser.class, id);
	}
	
	public void createUser(PetStoreUser user) {
		em.persist(user);
	}
}
