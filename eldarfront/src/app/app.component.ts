import { Component } from '@angular/core';
import { Router } from '@angular/router'; 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'eldar-front';
  showHomeContent = true
  constructor(private router: Router){
    this.showHomeContent=false
    this.router.navigate(['invitations'])

  }

  navigateInvitations(fillLists:boolean){
this.router.navigate(['invitations'])
  }

}
