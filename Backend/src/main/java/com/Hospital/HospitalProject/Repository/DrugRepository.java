package com.Hospital.HospitalProject.Repository;

import com.Hospital.HospitalProject.Domain.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrugRepository extends JpaRepository<Drug, String> {
    Optional<Drug> findByDrugSerialNo(String drugSerialNo);
}