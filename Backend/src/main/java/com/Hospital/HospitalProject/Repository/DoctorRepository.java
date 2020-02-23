package com.Hospital.HospitalProject.Repository;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Dto.DoctorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

    //@Query(value = "Select d from Doctor d where email=?1")
    Doctor findByDoctorEmail(String doctorEmail);

    Optional<List<Doctor>> findByDoctorBranch(String doctorBranch);
}
