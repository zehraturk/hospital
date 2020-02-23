import { Component, OnInit } from '@angular/core';
import { DiseaseService } from '../service/disease.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Disease } from '../domain/disease.domain';

@Component({
  selector: 'app-disease',
  templateUrl: './disease.component.html',
  styleUrls: ['./disease.component.css']
})
export class DiseaseComponent implements OnInit {

  diseases:Disease[];
  diseaseForm:FormGroup;
 

  constructor(private diseaseService:DiseaseService,private formBuilder:FormBuilder) {
    
   }

  ngOnInit() {
    this.diseaseForm = this.formBuilder.group({
      diseaseIcd: ['', Validators.required],
      diseaseName: ['', Validators.required],
      diseaseDescription: ['', Validators.required],
    
  });
    
  }


  saveDisease(){
    this.diseaseService.saveDisease(this.diseaseForm.value).subscribe(
      data=>{
        console.log(this.diseaseForm.value);
      }
    )
      
 }

 public getDiseaseList(){
   this.diseaseService.getDiseases().subscribe(
     data=>{
       console.log("burda");
       this.diseases=data;
       console.log(data);
     }
   )
}
     
  
    

  
}
