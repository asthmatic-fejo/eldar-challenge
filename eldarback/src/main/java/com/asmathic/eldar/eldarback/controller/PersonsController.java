package com.asmathic.eldar.eldarback.controller;

import com.asmathic.eldar.eldarback.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonsController {

    private PersonService personService;

    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/persons")
    public ResponseEntity getAllPersons() {

        return ResponseEntity.ok(personService.findAllPersons());
    }

}
