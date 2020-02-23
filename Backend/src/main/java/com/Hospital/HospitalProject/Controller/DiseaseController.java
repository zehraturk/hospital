package com.Hospital.HospitalProject.Controller;
import com.Hospital.HospitalProject.Domain.Disease;
import com.Hospital.HospitalProject.Service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping("/api-disease")
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;

    @GetMapping(value = "/getdisase/{diseaseId}")
    public Optional<Disease> getDiseaseById(@PathVariable String diseaseId) {
        return diseaseService.getDiseaseById(diseaseId);
    }
    @GetMapping(value = "/getdiseaselist")
    public List<Disease> getDiseaseList() {
        System.out.println("backend controller");
        return diseaseService.getDiseaseList();
    }
    @PostMapping("/save")
    public Disease save(@RequestBody Disease disease) {
        return diseaseService.save(disease);
    }
}
