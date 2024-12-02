package com.springboot.Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Hospital.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
