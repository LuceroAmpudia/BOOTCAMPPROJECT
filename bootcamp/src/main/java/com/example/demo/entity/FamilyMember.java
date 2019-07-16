package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="familyMember") //With this annotation I create my table in the database
public class FamilyMember {

	// Here my identifier is defined as the primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFamilyMember;
	
	// With the annotation @Column I name each column of the database
	@Column(name="parent_or_student_member", length=50)  
	private String parentOrStudentMember;

	
	// With the annotation @ManyToOne I establish the relationship of many with one.
	@ManyToOne                            
	@JoinColumn(name="parent_id", referencedColumnName = "idParent")		 
	private Parent idParent;
	
	@ManyToOne                     		
	@JoinColumn(name="student_id", referencedColumnName = "idStudent")		
	private Student idStudent;
	
	@ManyToOne                          
	@JoinColumn(name="family_id",referencedColumnName = "idFamily")		
	private Family idFamily;

	public int getIdFamilyMember() {
		return idFamilyMember;
	}

	public void setIdFamilyMember(int idFamilyMember) {
		this.idFamilyMember = idFamilyMember;
	}

	public String getParentOrStudentMember() {
		return parentOrStudentMember;
	}

	public void setParentOrStudentMember(String parentOrStudentMember) {
		this.parentOrStudentMember = parentOrStudentMember;
	}

	public Parent getIdParent() {
		return idParent;
	}

	public void setIdParent(Parent idParent) {
		this.idParent = idParent;
	}

	public Student getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Student idStudent) {
		this.idStudent = idStudent;
	}

	public Family getIdFamily() {
		return idFamily;
	}

	public void setIdFamily(Family idFamily) {
		this.idFamily = idFamily;
	}

	
	// Here the getters and setters are generated
	
	
}
