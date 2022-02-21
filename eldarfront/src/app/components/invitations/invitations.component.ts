import { CdkDragDrop, moveItemInArray, transferArrayItem } from '@angular/cdk/drag-drop';
import { Component, OnInit } from '@angular/core';
import { Person } from 'src/app/model/person';
import { InvitationServiceService as InvitationService } from 'src/app/services/invitation-service.service';
import { PersonsDataServiceService as PersonsDataService } from 'src/app/services/persons-data-service.service';

@Component({
  selector: 'app-invitations',
  templateUrl: './invitations.component.html',
  styleUrls: ['./invitations.component.css']
})
export class InvitationsComponent implements OnInit {

  availablePeople: Person[] = []
  confirmedPeople: Person[] = []

  constructor(public personService: PersonsDataService, public invitationService: InvitationService) {
  }

  ngOnInit() {
    this.availablePeople = []
    this.confirmedPeople = []
    this.personService.getAvailablePeople().subscribe(data => {
      data.forEach((algo: Person) => {
        this.availablePeople.push(algo)
      });
    });;
  }

  drop(event: CdkDragDrop<Person[]>) {
    if (event.previousContainer === event.container) {
      moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
    } else {
      transferArrayItem(
        event.previousContainer.data,
        event.container.data,
        event.previousIndex,
        event.currentIndex,
      );
    }
  }

  sendInvitations() {
    this.invitationService.sendInvitationsTo(this.confirmedPeople).subscribe(
      x => alert('Notificaciones enviadas exitosamente!'),
      err => console.error('Unexpected error invitating people: ' + err),
      () => this.ngOnInit()
    )


  }
}