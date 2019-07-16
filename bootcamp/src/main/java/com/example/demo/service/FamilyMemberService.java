package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.FamilyMember;

public interface FamilyMemberService {

	Optional<FamilyMember> get(Integer idFamilyMember);
	FamilyMember save(FamilyMember pattern);
	List<FamilyMember> findAll(FamilyMember pattern);
	void delete(Integer idFamilyMember);
	FamilyMember update (FamilyMember pattern);
	
}
