import { Component, OnInit } from '@angular/core';
import { Doctor } from '../../domain/doctor.domain';
import { DoctorService } from '../../service/doctor.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  doctor:Doctor;
  registerForm: FormGroup;
  constructor(private doctorService:DoctorService, private formBuilder:FormBuilder) {}
   register() {
      this.doctorService.register( this.registerForm.value).subscribe(
        data => {
            console.log(data.doctorName)
        },
        error => {
        });;   
  }
  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      doctorName: ['', Validators.required],
      doctorSurname: ['', Validators.required],
      doctorPassword: ['', Validators.required],
      doctorEmail: ['', [Validators.required,Validators.minLength(6)]],
      doctorBranch:['', Validators.required],
  });
  }

}
