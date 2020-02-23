import { Component, OnInit } from '@angular/core';
import { DoctorService } from '../service/doctor.service';
import { LoginService } from '../login/login.service';
import { Doctor } from '../domain/doctor.domain';

@Component({
  selector: 'app-doctor-info',
  templateUrl: './doctor-info.component.html',
  styleUrls: ['./doctor-info.component.css']
})
export class DoctorInfoComponent implements OnInit {

  doctor: Doctor;
  doctorEmail:string;

  constructor(private doctorService: DoctorService, private loginService: LoginService) { }

  ngOnInit() {
    this.doctorEmail=this.loginService.getloggedDoctor().doctorEmail;
  }


  /*getDoctorByEmail(){
    this.doctorService.getDoctorByEmail(this.loginService.getloggedDoctor().doctorEmail).subscribe(
      data=>{
        console.log(data);
      }
    )
  }*/

}
