package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FamilyMember;

//import com.example.demo.model.FamilyMember;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Integer>
{

}
