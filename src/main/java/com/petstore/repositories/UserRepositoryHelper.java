package com.petstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petstore.model.PetStoreUser;

@Repository
public interface UserRepositoryHelper extends JpaRepository<PetStoreUser, Long> {

	PetStoreUser findByName(String name);
}
