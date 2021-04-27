package com.hcl.cs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PETS1")
public class Pet {
	@Id
    @Column(name="PetId")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="PetName")
    @NotNull
    private String name;
   
    @Column(name="PetAge")
    private int age;
    @Column(name="PetPlace")
    private String place;
   
    @JoinColumn(name="UserId",nullable=true)
    private Long ownerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Pet(Long id, String name, int age, String place, Long ownerId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.place = place;
		this.ownerId = ownerId;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
