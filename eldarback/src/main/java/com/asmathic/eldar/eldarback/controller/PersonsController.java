package com.asmathic.eldar.eldarback.controller;

import com.asmathic.eldar.eldarback.model.InvitationWrapper;
import com.asmathic.eldar.eldarback.repository.entities.Person;
import com.asmathic.eldar.eldarback.service.PersonService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/persons")
public class PersonsController {

    private PersonService personService;

    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAvailablePeople() {
        return ResponseEntity.ok(personService.findAvailablePeople());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity invitePeople(@RequestBody InvitationWrapper invitation) {
        if (invitation.getPersons() == null || invitation.getPersons().isEmpty()) {
            ResponseEntity.badRequest();
        }
        this.personService.updateInvitedPeopleState(invitation.getPersons());
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity addNewPerson(@RequestBody Person newPerson) {
        try {
            if (this.personService.existsById(newPerson.getDni())) {
                return ResponseEntity.badRequest().body(newPerson.getDni());
            } else {
                return ResponseEntity.ok(this.personService.saveOrUpdate(newPerson));
            }

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error agregando persona.");
        }
    }

    @DeleteMapping
    public ResponseEntity addNewPerson(@RequestParam String id) {
        try {
            if (id != null) {
                this.personService.deleteById(id);
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.badRequest().build();
            }

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }


}
