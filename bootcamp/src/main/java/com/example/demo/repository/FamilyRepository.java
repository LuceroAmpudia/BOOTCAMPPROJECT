package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Family;

public interface FamilyRepository extends JpaRepository<Family, Integer>{

}
