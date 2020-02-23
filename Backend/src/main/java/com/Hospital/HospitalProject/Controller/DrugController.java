package com.Hospital.HospitalProject.Controller;

import com.Hospital.HospitalProject.Domain.Doctor;
import com.Hospital.HospitalProject.Domain.Drug;
import com.Hospital.HospitalProject.Service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api-drug")
public class DrugController {

    @Autowired
    DrugService drugService;

    @GetMapping(value = "/getdrugbyid/{drugId}")
    public Optional<Drug> getDrugById(@PathVariable String drugId) {
        return drugService.getDrugById(drugId);
    }

    @GetMapping(value = "/getdrugbyserialno/{drugSerialNo}")
    public Optional<Drug> getDrugBySerialNo(@PathVariable String drugSerialNo) {
        return drugService.getDrugBySerialNo(drugSerialNo);
    }

    @PostMapping("/save")
    public Drug save(@RequestBody Drug drug) {
        return drugService.save(drug);
    }

    @GetMapping(value = "/getdruglist")
    public List<Drug> getDrugList() {
        return drugService.getDrugList();
    }

}
