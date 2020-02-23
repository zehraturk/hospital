import { Injectable } from '@angular/core';
import { Patient } from '../domain/patient.domain';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private path:string;

  constructor(private httpclient:HttpClient) {
    this.path=this.path = 'http://localhost:8080/api-patient';
   }

   public savePatient(patient:Patient){
    return this.httpclient.post<Patient>(this.path+"/register",patient).pipe();
  }


  public getPatients():Observable<Patient[]>{
    return this.httpclient.get<Patient[]>(this.path+"/getpatientlist").pipe();
  }

 /* public getPatientByTcno(){
    return this.httpclient.get<Patient>(this.path+"/getpatientbytcno/{patientTcNo}").pipe();

  }*/
}
