import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { RegisterFormComponent } from './forms/register-form/register-form.component';
import { DoctorService } from './service/doctor.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { LoginComponent } from './login/login.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { DiseaseComponent } from './disease/disease.component';
import { DiseaseSaveFormComponent } from './disease/disease-save-form/disease-save-form.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegisterFormComponent,
    DoctorListComponent,
    LoginComponent,
    PatientListComponent,
    DoctorInfoComponent,
    DiseaseComponent,
    DiseaseSaveFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserModule,
    ReactiveFormsModule,
    
  ],
  providers: [DoctorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
