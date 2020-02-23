package com.Hospital.HospitalProject.Repository;

import com.Hospital.HospitalProject.Domain.Disease;
import com.Hospital.HospitalProject.Domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease, String> {
    Optional<Disease> findByDiseaseIcd(String diseaseIcd);
}
