package com.springboot.Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Hospital.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
