import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InvitationsComponent } from './components/invitations/invitations.component';
import {DragDropModule} from '@angular/cdk/drag-drop';
import { PeopleDataModalComponent } from './components/people-data-modal/people-data-modal.component';

@NgModule({
  declarations: [
    AppComponent,
    InvitationsComponent,
    PeopleDataModalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DragDropModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
