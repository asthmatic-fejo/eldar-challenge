import { HttpClient } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { Person } from "../model/person";

@Injectable({
  providedIn: 'root'
})
export class PersonsDataServiceService {

  constructor(private http: HttpClient) { }

  getAvailablePeople(): Observable<any> {
    return this.http.get('http://localhost:8888/persons')
  }
}
