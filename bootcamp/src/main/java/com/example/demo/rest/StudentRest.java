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
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentRest {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/get/{idStudent}")
	public Optional<Student> get(@PathVariable("idStudent") int idStudent)
	{
		return studentService.get(idStudent);
	}
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student)
	{
		return studentService.save(student);
	}
	
	@GetMapping("/get")
	public List<Student> findAll()
	{
		return studentService.findAll(null);
	}
	
	
	@DeleteMapping("/delete/{idStudent}")
	public void delete(@PathVariable("idStudent") int idStudent)
	{
		studentService.delete(idStudent);
	}
	
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return studentService.update(student);
	}
	
	
	
//	@RequestMapping(value = "/studentT", method = RequestMethod.GET)
//	public Student firstPage() {
//
//		Student stu = new Student();
//		stu.setFirstName("Marcos");
//		stu.setMiddleName("Milan");
//		stu.setLastName("Jimenez");
//		stu.setGender("Masculino");
//		stu.setAge(21);
//		stu.setAddress("Av.Sucre 587");
//		stu.setDateOfBirth(null);
//		stu.setGrade("3er ciclo");
//		
//
//		return stu;
//	}
	
}
