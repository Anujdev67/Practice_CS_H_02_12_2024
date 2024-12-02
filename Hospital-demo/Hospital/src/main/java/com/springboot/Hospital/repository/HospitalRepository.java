package com.springboot.Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Hospital.model.Patient;

public interface HospitalRepository extends JpaRepository<Patient, Integer> {

}
