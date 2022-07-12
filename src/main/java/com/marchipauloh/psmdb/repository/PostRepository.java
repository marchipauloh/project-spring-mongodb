package com.marchipauloh.psmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marchipauloh.psmdb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}