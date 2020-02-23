package com.Hospital.HospitalProject.Repository;


import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Patient;
import com.Hospital.HospitalProject.Domain.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, String> {

    Optional<List<Treatment>> findByDoctor(Doctor doctor);

    Optional<List<Treatment>> findByPatient(Patient patient);
}