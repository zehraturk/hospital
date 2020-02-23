package com.Hospital.HospitalProject.Controller;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Dto.DoctorDto;
import com.Hospital.HospitalProject.Service.DoctorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api-doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/getdoctor/{doctorId}")
    public Optional<Doctor> getDoctorById(@PathVariable String doctorId) {
        return doctorService.getDoctorById(doctorId);
    }

    @GetMapping("/getdoctorbyemail/{doctorEmail}")
    public Doctor getDoctorByEmail(@PathVariable String doctorEmail) {
        return doctorService.getDoctorByEmail(doctorEmail);
    }

    @PostMapping("/login")
    public Doctor login(@RequestBody DoctorDto doctorDto) {
        ModelMapper modelMapper = new ModelMapper();
        Doctor doctor = modelMapper.map(doctorDto, Doctor.class);
        return doctorService.login(doctor);
    }

    @GetMapping("/getdoctorbybranch/{doctorBranch}")
    public Optional<List<Doctor>> getDoctorByBranch(@PathVariable String doctorBranch){
        return doctorService.getDoctorByBranch(doctorBranch);
    }

    @PostMapping("/register")
    public Doctor register(@RequestBody Doctor doctor) {
        return doctorService.register(doctor);
    }

    @GetMapping("/getdoctorlist")
    public List<Doctor> getDoctorList() {
        return doctorService.getDoctorList();
    }


}
