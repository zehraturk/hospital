package com.Hospital.HospitalProject.Repository;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

    Optional<Patient> findByPatientTcNo(String patientTcNo);


}
