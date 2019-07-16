package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Family;


public interface FamilyService {

	Optional<Family> get(Integer idFamily);
	Family save(Family pattern);
	List<Family> findAll(Family pattern);
	Family update (Family pattern);
	void delete(Integer idFamily);
	
}
