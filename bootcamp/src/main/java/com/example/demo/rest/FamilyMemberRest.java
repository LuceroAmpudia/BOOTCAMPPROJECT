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


import com.example.demo.entity.FamilyMember;
import com.example.demo.service.FamilyMemberService;


@RestController
@RequestMapping("/familyMember")
public class FamilyMemberRest {

	@Autowired
	FamilyMemberService familyMemberService;
	
	@GetMapping("/get/{idFamilyMember}")
	public Optional<FamilyMember> get(@PathVariable("idFamilyMember") int idFamilyMember)
	{
		return familyMemberService.get(idFamilyMember);
	}
	
	@PostMapping("/save")
	public FamilyMember save(@RequestBody FamilyMember familyMember)
	{
		return familyMemberService.save(familyMember);
	}
	
	@GetMapping("/get")
	public List<FamilyMember> findAll()
	{
		return familyMemberService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idFamilyMember}")
	public void delete(@PathVariable("idFamilyMember") int idFamilyMember)
	{
		familyMemberService.delete(idFamilyMember);
	}
	
	
	@PutMapping("/update")
	public FamilyMember update(@RequestBody FamilyMember familyMember)
	{
		return familyMemberService.update(familyMember);
	}
	
	
	
}
