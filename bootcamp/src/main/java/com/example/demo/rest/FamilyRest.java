package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Family;
import com.example.demo.service.FamilyService;


@RestController
@RequestMapping("/family")
public class FamilyRest {

	@Autowired
	FamilyService familyService;
	
	@GetMapping("/get/{idFamily}")
	public Optional<Family> get(@PathVariable("idFamily") int idFamily)
	{
		return familyService.get(idFamily);
	}
	
	@PostMapping("/save")
	public Family save(@RequestBody Family family)
	{
		return familyService.save(family);
	}
	
	@GetMapping("/get")
	public List<Family> findAll()
	{
		return familyService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idFamily}")
	public void delete(@PathVariable("idFamily") int idFamily)
	{
		familyService.delete(idFamily);
	}
	
	
	@PutMapping("/update")
	public Family update(@RequestBody Family family)
	{
		return familyService.update(family);
	}
}
