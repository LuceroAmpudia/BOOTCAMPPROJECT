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

import com.example.demo.entity.Parent;
import com.example.demo.service.ParentService;

@RestController
@RequestMapping("/parent")
public class ParentRest {

	@Autowired
	ParentService parentService;
	
	@GetMapping("/get/{idParent}")
	public Optional<Parent> get(@PathVariable("idParent") int idParent)
	{
		return parentService.get(idParent);
	}
	
	@PostMapping("/save")
	public Parent save(@RequestBody Parent parent)
	{
		return parentService.save(parent);
	}
	
	@GetMapping("/get")
	public List<Parent> findAll()
	{
		return parentService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idParent}")
	public void delete(@PathVariable("idParent") int idParent)
	{
		parentService.delete(idParent);
	}
	
	
	@PutMapping("/update")
	public Parent update(@RequestBody Parent parent)
	{
		return parentService.update(parent);
	}
}
