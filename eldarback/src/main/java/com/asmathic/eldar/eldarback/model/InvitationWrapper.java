package com.asmathic.eldar.eldarback.model;

import com.asmathic.eldar.eldarback.repository.entities.Person;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter not working idk why!
public class InvitationWrapper {

    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
