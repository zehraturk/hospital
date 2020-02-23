package com.Hospital.HospitalProject.Service;


import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Patient;
import com.Hospital.HospitalProject.Domain.Treatment;
import com.Hospital.HospitalProject.Repository.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TreatmentService {
    @Autowired
    TreatmentRepository treatmentRepository;

    public Treatment save(Treatment treatment) {

        return treatmentRepository.save(treatment);
    }

    public List<Treatment> getTreatmentListByDoctorId(String doctorId) {

        List<Treatment> eliminatedTreatment = new ArrayList<Treatment>();
        List<Treatment> allTreatment = treatmentRepository.findAll();
        for(Treatment trmnt : allTreatment ){
            if(trmnt.getDoctor().getDoctorId().equals(doctorId)){
                eliminatedTreatment.add(trmnt);
            }
        }
       return eliminatedTreatment;
        // return treatmentRepository.findAll().forEach( t -> t.getDoctor().getDoctorId()).map(t -> t.getDoctor().getDoctorId().equals(doctorId)).collect(Collectors.toList());
    }

    public List<Patient> getPatientListByDoctor(String doctorId) {
        /*
        List<Treatment> listTreatment = getTreatmentListByDoctorId(doctorId);

        List<Patient>  colPatient = new ArrayList<Patient>();
        for(Treatment si : listTreatment ){
            colPatient.add(si.getPatient());

        }

        return colPatient;
        */

        return getTreatmentListByDoctorId(doctorId).stream().map(p -> p.getPatient()).collect(Collectors.toList());
        // return treatmentRepository.findByDoctor(doctor).get().stream().map(p -> p.getPatient()).collect(Collectors.toList());
    }

    public Optional<List<Treatment>> getTreatmentListByPatient(Patient patient) {
        return treatmentRepository.findByPatient(patient);
    }

    /******************************************************************************************************************/

    public List<Treatment> getTreatmentList() {
        return treatmentRepository.findAll();
    }

    public Optional<Treatment> getTreatmentById(String treatmentId) {
        return treatmentRepository.findById(treatmentId);
    }
}
