package com.example.demo.serviceimplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	//implementacion del metodo para obtener datos
			@Override
			public Optional<Student> get(Integer idStudent) {
				
				return studentRepository.findById(idStudent);
			}

			//implementacion del metodo para guardar los datos
			@Override
			public Student save(Student pattern) {
				
				return studentRepository.save(pattern);
			}

			//implementacion del metodo para listar los datos
			@Override
			public List<Student> findAll(Student pattern) {
				
				return studentRepository.findAll();
			}

			//implementacion del metodo para eliminar datos
			@Override
			public void delete(Integer idStudent) {
				studentRepository.deleteById(idStudent);
			}

			
			//implementacion del metodo para actuailzar datos
			@Override
			public Student update(Student pattern) {
				
				return studentRepository.save(pattern);
			}
			
	
				
				
	
}
