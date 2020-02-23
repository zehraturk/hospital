package com.Hospital.HospitalProject.Service;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Drug;
import com.Hospital.HospitalProject.Repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugService {

    @Autowired
    DrugRepository drugRepository;

    public Optional<Drug> getDrugById(String drugId) {
        return drugRepository.findById(drugId);
    }

    public boolean isDrug(Drug drug) {
        if (getDrugBySerialNo(drug.getDrugSerialNo()).equals(Optional.empty())) {
            return false;
        } else {
            return true;
        }
    }

    public Drug save(Drug drug) {
        if (!isDrug(drug)) {
            return drugRepository.save(drug);
        } else return null;
    }


    /******************************************************************************************************************/


    public List<Drug> getDrugList() {
        return drugRepository.findAll();
    }

    public Optional<Drug> getDrugBySerialNo(String drugSerialNo) {
        return drugRepository.findByDrugSerialNo(drugSerialNo);
    }





}
