package com.Hospital.HospitalProject.Controller;

import com.Hospital.HospitalProject.Domain.Patient;
import com.Hospital.HospitalProject.Service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api-patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping(value = "/getpatientbyid/{patientId}")
    public Optional<Patient> getPatientById(@PathVariable String patientId) {
        return patientService.getPatientById(patientId);
    }

    @GetMapping(value = "/getpatientbytcno/{patientTcNo}")
    public Optional<Patient> getPatientByTcNo(@PathVariable String patientTcNo) {
        return patientService.findByTcNo(patientTcNo);
    }

    @PostMapping("/register")
    public Patient register(@RequestBody Patient patient) {
        return patientService.register(patient);
    }

    @GetMapping("/getpatientlist")
    public List<Patient> getPatientList() {
        return patientService.getPatientList();
    }


}


