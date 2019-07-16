package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Parent;


public interface ParentService {

	Optional<Parent> get(Integer idParent);
	Parent save(Parent pattern);
	List<Parent> findAll(Parent pattern);
	Parent update (Parent pattern);
	void delete(Integer idParent);
	
}
