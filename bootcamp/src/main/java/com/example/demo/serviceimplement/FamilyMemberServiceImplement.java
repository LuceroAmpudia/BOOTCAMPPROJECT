package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FamilyMember;
import com.example.demo.repository.FamilyMemberRepository;
import com.example.demo.service.FamilyMemberService;


@Service
public class FamilyMemberServiceImplement implements FamilyMemberService{

	//Aqui se llama al repositorio 
	@Autowired
	private FamilyMemberRepository familyMemberRepository;

	//implementacion del metodo para obtener datos
	@Override
	public Optional<FamilyMember> get(Integer idFamilyMember) {
		
		return familyMemberRepository.findById(idFamilyMember);
	}

	//implementacion del metodo para guardar los datos
	@Override
	public FamilyMember save(FamilyMember pattern) {
		
		return familyMemberRepository.save(pattern);
	}

	//implementacion del metodo para listar los datos
	@Override
	public List<FamilyMember> findAll(FamilyMember pattern) {
		
		return familyMemberRepository.findAll();
	}

	//implementacion del metodo para eliminar datos
	@Override
	public void delete(Integer idFamilyMember) {
		familyMemberRepository.deleteById(idFamilyMember);
	}

	
	//implementacion del metodo para actuailzar datos
	@Override
	public FamilyMember update(FamilyMember pattern) {
		
		return familyMemberRepository.save(pattern);
	}
	
}
