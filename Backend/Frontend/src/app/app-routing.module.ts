import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterFormComponent } from './forms/register-form/register-form.component';
import { DoctorListComponent } from './doctor-list/doctor-list.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { PatientListComponent } from './patient-list/patient-list.component';
import { DiseaseComponent } from './disease/disease.component';

const routes: Routes = [
  {path:'register',component:RegisterFormComponent},
  {path:'doctors',component:DoctorListComponent},
  {path:'login',component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'',component:HomeComponent},
  {path:'doctor',component:DoctorInfoComponent},
  {path:'patients',component:PatientListComponent},
  //{path:'disease',component:DiseaseSaveFormComponent},
  {path:'diseases',component:DiseaseComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
