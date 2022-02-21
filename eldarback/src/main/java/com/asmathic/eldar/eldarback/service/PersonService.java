package com.asmathic.eldar.eldarback.service;

import com.asmathic.eldar.eldarback.repository.PersonRepository;
import com.asmathic.eldar.eldarback.repository.entities.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAllPersons() {
        return this.personRepository.findAll();
    }
}
