import { Component, OnInit, ViewChild } from '@angular/core';
import { FormGroup, FormBuilder, Validators, NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from './login.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:FormGroup;
  isLoggedIn:boolean;
  constructor(private loginService:LoginService,
    private formBuilder: FormBuilder,
    private router: Router) { }
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      doctorPassword: ['', Validators.required],
      doctorEmail: ['', [Validators.required,Validators.minLength(5)]],  
  });
  }
  login() {
    console.log(this.loginForm.value);
    this.loginService.login(this.loginForm.value).subscribe(
      data => {
          this.loginService.setloggedDoctor(data);
          this.loginService.setIsLoggedIn(true);
          console.log(this.loginService.getloggedDoctor);
          this.router.navigate(['/home']);   
      },
      error => {
        this.loginService.setIsLoggedIn(false);
        console.log("login component with error");
      });;   
  }
}
