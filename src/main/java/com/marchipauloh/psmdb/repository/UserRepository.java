package com.marchipauloh.psmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marchipauloh.psmdb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
