import { TestBed } from '@angular/core/testing';

import { PersonsDataServiceService } from './persons-data-service.service';

describe('PersonsDataServiceService', () => {
  let service: PersonsDataServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PersonsDataServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
