package com.Hospital.HospitalProject.Service;

import com.Hospital.HospitalProject.Domain.Disease;
import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Drug;
import com.Hospital.HospitalProject.Repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiseaseService {

    @Autowired
    DiseaseRepository diseaseRepository;

    public Boolean isDisease(Disease disease) {
        if (getDiseaseBydiseaseIcd(disease.getDiseaseIcd()).equals(Optional.empty())) {
            return false;
        } else return true;
    }

    public Disease save(Disease disease) {
        if (!isDisease(disease)) {
            return diseaseRepository.save(disease);
        } else return null;
    }


    /******************************************************************************************************************/


    public List<Disease> getDiseaseList() {
        System.out.println("backend service");
        return diseaseRepository.findAll();
    }


    public Optional<Disease> getDiseaseById(String diseaseId) {
        return diseaseRepository.findById(diseaseId);
    }

    public Optional<Disease> getDiseaseBydiseaseIcd(String diseaseIcd) {
        return diseaseRepository.findByDiseaseIcd(diseaseIcd);
    }
}
