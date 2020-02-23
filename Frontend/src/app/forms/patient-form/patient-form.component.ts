import { Component, OnInit } from '@angular/core';
import { Patient } from 'src/app/domain/patient.domain';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { PatientService } from 'src/app/service/patient.service';

@Component({
  selector: 'app-patient-form',
  templateUrl: './patient-form.component.html',
  styleUrls: ['./patient-form.component.css']
})
export class PatientFormComponent implements OnInit {
  patient:Patient;
  patientForm:FormGroup;

  constructor(private patientService:PatientService, private formBuilder:FormBuilder) { }

  ngOnInit() {
    this.patientForm = this.formBuilder.group({
      patientTcNo: ['', Validators.required],
      patientName: ['', Validators.required],
      patientSurname: ['', Validators.required],
      
  });
  }

  savePatient() {
    this.patientService.savePatient( this.patientForm.value).subscribe(
      data => {
          console.log(data.patientName);
      },
      error => {
        console.log("patient-form-component save with error")
      });;   
}
}
