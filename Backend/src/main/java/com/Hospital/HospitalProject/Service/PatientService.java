package com.Hospital.HospitalProject.Service;

import com.Hospital.HospitalProject.Domain.Patient;
import com.Hospital.HospitalProject.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Boolean isPatient(Patient patient) {
        if (findByTcNo(patient.getPatientTcNo()).equals(Optional.empty())) { //get fiilinden sonra gelen değişken ismi büyük harfli olmalı.
            return false;
        } else return true;
    }

    public Patient register(Patient patient) {
        if (!isPatient(patient)) {
            return save(patient);
        } else return null;
    }


    /******************************************************************************************************************/


    public List<Patient> getPatientList() {
        return patientRepository.findAll();
    }


    public Optional<Patient> findByTcNo(String patientTcNo) {

        return patientRepository.findByPatientTcNo(patientTcNo);
    }


    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }


    public Optional<Patient> getPatientById(String patientId) {
        return patientRepository.findById(patientId);
    }
}