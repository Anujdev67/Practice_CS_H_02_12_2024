package com.springboot.Hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String specialiazation;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialiazation() {
	return specialiazation;
}
public void setSpecialiazation(String specialiazation) {
	this.specialiazation = specialiazation;
}
}