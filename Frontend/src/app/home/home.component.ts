import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login/login.service';
import { PatientService } from '../service/patient.service';
import { Patient } from '../domain/patient.domain';
import { TreatmentService } from '../service/treatment.service';
@Component({
	selector: 'app-home',
	templateUrl: './home.component.html',
	styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
	patients: Patient[];
	constructor(private loginService:LoginService,private treatmentService:TreatmentService,private patientService:PatientService) {
	 }
	ngOnInit() {
			this.patientService.getPatients().subscribe(
				data=>{
					this.patients=data;
				}
			)
	}
}