import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Doctor } from '../domain/doctor.domain';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  private path: string;

  constructor(private httpclient: HttpClient) {
    this.path = 'http://localhost:8080/api-doctor';
  }

  public register(doctor:Doctor){
    return this.httpclient.post<Doctor>(this.path+"/register",doctor).pipe();
  }

  public getDoctors():Observable<Doctor[]>{
    return this.httpclient.get<Doctor[]>(this.path+"/getdoctorlist").pipe();
  }

}
