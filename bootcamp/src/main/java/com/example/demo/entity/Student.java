package com.example.demo.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student") //With this annotation I create my table in the database
public class Student {

	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStudent;
	
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
	
	@Column(name="date_of_birth", length=50)
	private Date dateOfBirth;
	
	@Column(name="grade", length=50)
	private String grade;

	@ManyToMany
	@JoinTable(
			  name = "Parent_Student", 
			  joinColumns = @JoinColumn(name = "idStudent", referencedColumnName = "idStudent"),
			  inverseJoinColumns = @JoinColumn(name = "idParent"))
    Set<Parent> ParentStudent;
	
	
	public Student(String string) {
		// TODO Auto-generated constructor stub
	}

	// Here the getters and setters are generated
	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	public Student() {
	}

	
}
