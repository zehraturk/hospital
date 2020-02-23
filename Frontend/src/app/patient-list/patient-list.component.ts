import { Component, OnInit } from '@angular/core';
import { Patient } from '../domain/patient.domain';
import { LoginService } from '../login/login.service';
import { TreatmentService } from '../service/treatment.service';
import { Doctor } from '../domain/doctor.domain';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html',
  styleUrls: ['./patient-list.component.css']
})
export class PatientListComponent implements OnInit {

  patients: Patient[];
  
  constructor(private loginService: LoginService, private treatmentService: TreatmentService) { }

  ngOnInit() {
 
    this.treatmentService.getPatientsByDoctor(this.loginService.getloggedDoctor()).subscribe(
      
      data => {
        console.log(data) ;
        this.patients = data;
      }
    )

  }



}
