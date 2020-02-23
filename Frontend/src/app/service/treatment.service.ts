import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Doctor } from '../domain/doctor.domain';
import { Patient } from '../domain/patient.domain';
import { Observable } from 'rxjs';
import { LoginService } from '../login/login.service';

@Injectable({
  providedIn: 'root'
})
export class TreatmentService {

  private path:string;
 
 //url='http://localhost:8080/api-treatment/getpatientlistbydoctor/';

  constructor(private httpclient:HttpClient,private loginService:LoginService) {
    this.path=this.path = 'http://localhost:8080/api-treatment';
   }

   public getPatientsByDoctor(doctor:Doctor):Observable<Patient[]>{
   
     return this.httpclient.post<Patient[]>(this.path+"/getpatientlistbydoctor",doctor).pipe();
   }
}
