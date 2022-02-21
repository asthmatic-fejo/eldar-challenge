import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PeopleDataModalComponent } from './people-data-modal.component';

describe('PeopleDataModalComponent', () => {
  let component: PeopleDataModalComponent;
  let fixture: ComponentFixture<PeopleDataModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PeopleDataModalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PeopleDataModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
