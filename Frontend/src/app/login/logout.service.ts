import { Injectable } from '@angular/core';
import { LoginService } from './login.service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LogoutService {

  constructor(private loginService:LoginService,private router:Router){}
   
  logout(){
      this.loginService.setloggedDoctor(null);
      this.loginService.setIsLoggedIn(false);
      console.log(this.loginService.getloggedDoctor);
      this.router.navigate(['/']); 
}
}
