import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Disease } from '../domain/disease.domain';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DiseaseService {

  path:string;
  constructor(private httpclient:HttpClient) { 
    this.path = 'http://localhost:8080/api-disease';
  }

  public saveDisease(disease:Disease){
    return this.httpclient.post<Disease>(this.path+"/save",disease).pipe();

  }

  public getDiseases():Observable<Disease[]>{
    return this.httpclient.get<Disease[]>(this.path+"/getdiseaselist").pipe();
  }
}
