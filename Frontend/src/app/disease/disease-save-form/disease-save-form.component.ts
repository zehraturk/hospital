import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { DiseaseService } from 'src/app/service/disease.service';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-disease-save-form',
  templateUrl: './disease-save-form.component.html',
  styleUrls: ['./disease-save-form.component.css']
})
export class DiseaseSaveFormComponent implements OnInit {
 

  

  constructor(private diseaseService:DiseaseService,
              private formBuilder:FormBuilder) { }

  ngOnInit() {
  
  }


 

}
