import { Component, OnInit } from '@angular/core';
import { Doctor } from '../domain/doctor.domain';
import { DoctorService } from '../service/doctor.service';

@Component({
  selector: 'app-doctor-list',
  templateUrl: './doctor-list.component.html',
  styleUrls: ['./doctor-list.component.css']
})
export class DoctorListComponent implements OnInit {
  doctors:Doctor[];

  constructor(private doctorService:DoctorService) { }

  ngOnInit() {
    this.doctorService.getDoctors().subscribe(data=>{
      this.doctors=data;
    })
  }

  

}
