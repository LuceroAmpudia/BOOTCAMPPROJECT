package com.example.demo.entity;

//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="family") //With this annotation I create my table in the database
public class Family {

	// Here my identifier is defined as the primary key
	@Id     
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFamily;
	
	// With the annotation @Column I name each column of the database
	@Column (name="family_name", length=50)  
	private String familyName;
	
	

	// With the annotation @ManyToOne I establish the relationship of many with one.
	@ManyToOne                   
	@JoinColumn(name="family_leader",referencedColumnName = "idParent")	
	private Parent idParent;

	
	

	// Here the getters and setters are generated
	
	public int getIdFamily() {
		return idFamily;
	}

	public void setIdFamily(int idFamily) {
		this.idFamily = idFamily;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Parent getIdParent() {
		return idParent;
	}

	public void setIdParent(Parent idParent) {
		this.idParent = idParent;
	}

	
	



	
	
}
