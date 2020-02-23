import { Injectable } from '@angular/core';
import { Doctor } from '../domain/doctor.domain';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  path='http://localhost:8080/api-doctor';
  loggedDoctor: Doctor;
  isLoggedIn:boolean;
  constructor(private httpclient:HttpClient) { }
 public login(doctor:Doctor){
    return this.httpclient.post<Doctor>(this.path+"/login",doctor).pipe();
  }
getloggedDoctor(){  return this.loggedDoctor;}
setloggedDoctor(doctor){  this.loggedDoctor=doctor;}
getIsLoggedIn(){ return this.isLoggedIn;  }
setIsLoggedIn(status:boolean){ this.isLoggedIn=status;}
}
