package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Parent;
import com.example.demo.repository.ParentRepository;
import com.example.demo.service.ParentService;

@Service
public class ParentServiceImplement implements ParentService{

	@Autowired 
	private ParentRepository parentRepository;
	
	//implementacion del metodo para obtener datos
		@Override
		public Optional<Parent> get(Integer idParent) {
			
			return parentRepository.findById(idParent);
		}

		//implementacion del metodo para guardar los datos
		@Override
		public Parent save(Parent pattern) {
			
			return parentRepository.save(pattern);
		}

		//implementacion del metodo para listar los datos
		@Override
		public List<Parent> findAll(Parent pattern) {
			
			return parentRepository.findAll();
		}

		//implementacion del metodo para eliminar datos
		@Override
		public void delete(Integer idParent) {
			parentRepository.deleteById(idParent);
		}

		
		//implementacion del metodo para actuailzar datos
		@Override
		public Parent update(Parent pattern) {
			
			return parentRepository.save(pattern);
		}
}
