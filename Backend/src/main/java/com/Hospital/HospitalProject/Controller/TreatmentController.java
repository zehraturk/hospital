package com.Hospital.HospitalProject.Controller;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Patient;
import com.Hospital.HospitalProject.Domain.Treatment;
import com.Hospital.HospitalProject.Service.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api-treatment")
public class TreatmentController {

    @Autowired
    TreatmentService treatmentService;

    @GetMapping(value = "/gettreatmentbyid/{treatmentId}")
    public Optional<Treatment> getTreatmentById(@PathVariable String treatmentId) {
        return treatmentService.getTreatmentById(treatmentId);
    }
    @GetMapping("/gettreatmentlistbydoctorid/{doctorId}")
    public List<Treatment> getTraitmentListByDoctorId(@PathVariable String doctorId){
           return treatmentService.getTreatmentListByDoctorId(doctorId);
    }
    @GetMapping("/getpatientlistbydoctorid/{doctorId}")
    public  List<Patient>  getPatientListByDoctor(@PathVariable String doctorId){
        return treatmentService.getPatientListByDoctor(doctorId);
    }
    @GetMapping("/gettreatmentlistbypatient/{patient}")
    public Optional<List<Treatment>> getTreatmentListByPatient(@PathVariable Patient patient){
        return treatmentService.getTreatmentListByPatient(patient);
    }
    @GetMapping("/gettreatmentlist")
    public List<Treatment> getTreatmentList() {
        return treatmentService.getTreatmentList();
    }
    @PostMapping("/save")
    public Treatment save(@RequestBody Treatment treatment) {
        return treatmentService.save(treatment);
    }
}
