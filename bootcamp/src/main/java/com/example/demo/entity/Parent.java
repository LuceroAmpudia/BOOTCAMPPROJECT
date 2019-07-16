package com.example.demo.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="parent") //With this annotation I create my table in the database
public class Parent {

	// Here my identifier is defined as the primary key
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY) 

	private int idParent;
	

 
	// With the annotation @Column I name each column of the database
	
	@Column(name="first_name", length=50)
	private String firstName;
	
	@Column(name="middle_name", length=50)
	private String middleName;
	
	@Column(name="last_name", length=50)
	private String lastName;
	
	@Column(name="gender", length=50)
	private String gender;
	
	@Column(name="age", length=2)
	private int age;
	
	@Column(name="address", length=50)
	private String address;
	
	@Column(name="occupation", length=50)
	private String occupation;
	
	@Column(name="date_of_birth", length=50)
	private Date dateOfBirth;

	@ManyToMany(mappedBy = "ParentStudent")
	Set<Student> likes;
	
	// Here the getters and setters are generated

	public int getIdParent() {
		return idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
}
