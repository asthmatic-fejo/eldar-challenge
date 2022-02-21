import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Person } from '../model/person';

@Injectable({
  providedIn: 'root'
})
export class InvitationServiceService {
  constructor(private http: HttpClient) { }

  sendInvitationsTo(confirmedPeople: Person[]) {
    return this.http.post('http://localhost:8888/persons', { "persons": confirmedPeople})
  }

}
