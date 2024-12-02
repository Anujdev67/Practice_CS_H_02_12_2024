package com.springboot.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Hospital.model.Appointment;
import com.springboot.Hospital.model.Doctor;
import com.springboot.Hospital.service.HospitalService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	@GetMapping("/api/doctor/all")
	private List<Doctor> getAllDoctor() {
		return hospitalService.getAllDoctors();
	}

	@PostMapping("/api/doctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return hospitalService.addDoctor(doctor);
	}
	@PostMapping("/api/patient/appointment/add")
	public Appointment addAppointment(@RequestBody Appointment appointment) {
		return hospitalService.addAppointment(appointment);
	}
}
