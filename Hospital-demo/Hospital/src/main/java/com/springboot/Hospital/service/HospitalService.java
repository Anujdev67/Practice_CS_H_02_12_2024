package com.springboot.Hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Hospital.repository.AppointmentRepository;
import com.springboot.Hospital.repository.DoctorRepository;
import com.springboot.Hospital.repository.HospitalRepository;
import com.springboot.Hospital.model.Appointment;
import com.springboot.Hospital.model.Doctor; // Assuming Doctor is a model/entity class

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;

    // Fetch all doctors from the database
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll(); 
    }



	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}



	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}
}
