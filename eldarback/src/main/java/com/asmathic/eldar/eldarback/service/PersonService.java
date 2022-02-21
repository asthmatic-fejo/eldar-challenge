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

    public Person saveOrUpdate(Person person) {
        return this.personRepository.saveAndFlush(person);
    }

    public List<Person> findAvailablePeople() {
        return this.personRepository.findByPartyIdIsNull();
    }

    public void updateInvitedPeopleState(List<Person> invitedPeople) {
        invitedPeople.stream()
                .map(Person::invite)
                .forEach((invitedPerson) -> this.personRepository.save(invitedPerson));
    }

    public boolean existsById(String id) {
        return this.personRepository.existsById(id);
    }

    public void deleteById(String id) {
        this.personRepository.deleteById(id);
    }
}
