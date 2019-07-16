package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Family;
import com.example.demo.repository.FamilyRepository;
import com.example.demo.service.FamilyService;

@Service
public class FamilyServiceImplement implements FamilyService {

	//Aqui se llama al repositorio 
		@Autowired
		private FamilyRepository familyRepository;

		//implementacion del metodo para obtener datos
		@Override
		public Optional<Family> get(Integer idFamily) {
			
			return familyRepository.findById(idFamily);
		}

		//implementacion del metodo para guardar los datos
		@Override
		public Family save(Family pattern) {
			
			return familyRepository.save(pattern);
		}

		//implementacion del metodo para listar los datos
		@Override
		public List<Family> findAll(Family pattern) {
			
			return familyRepository.findAll();
		}

		//implementacion del metodo para eliminar datos
		@Override
		public void delete(Integer idFamily) {
			familyRepository.deleteById(idFamily);
		}

		
		//implementacion del metodo para actuailzar datos
		@Override
		public Family update(Family pattern) {
			
			return familyRepository.save(pattern);
		}
}
