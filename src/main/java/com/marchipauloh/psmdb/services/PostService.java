package com.marchipauloh.psmdb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marchipauloh.psmdb.domain.Post;
import com.marchipauloh.psmdb.repository.PostRepository;
import com.marchipauloh.psmdb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return postRepository.findByTitleContainingIgnoreCase(text);
	}
	
	public List<Post> searchTitle(String text){
		return postRepository.searchTitle(text);
	}
}
