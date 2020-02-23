import { Component } from '@angular/core';
import { LoginService } from './login/login.service';
import { LogoutService } from './login/logout.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hospital';
  constructor(private loginService:LoginService,
              private logoutService:LogoutService,
              private router:Router) {}
 
  
}
