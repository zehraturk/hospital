package com.Hospital.HospitalProject.Service;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Repository.DoctorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor login(Doctor doctor) {

        if (((getDoctorByEmail(doctor.getDoctorEmail())).getDoctorPassword()).equals(doctor.getDoctorPassword())) {
            return getDoctorByEmail(doctor.getDoctorEmail());
        } else {

            return null;
        }
    }

    public Doctor register(Doctor doctor) {
        if (!isDoctor(doctor)) {
            return save(doctor);
        } else return null;
    }

    public Boolean isDoctor(Doctor doctor) {
        if (getDoctorByEmail(doctor.getDoctorEmail()) == null) {
            return false;
        } else return true;
    }

    /******************************************************************************************************************/
    public List<Doctor> getDoctorList() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(String doctorId) {
        return doctorRepository.findById(doctorId);
    }

    public Doctor getDoctorByEmail(String doctorEmail) {
        return doctorRepository.findByDoctorEmail(doctorEmail);
    }

    public Optional<List<Doctor>> getDoctorByBranch(String doctorBranch){
        return doctorRepository.findByDoctorBranch(doctorBranch);
    }

    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }


}

