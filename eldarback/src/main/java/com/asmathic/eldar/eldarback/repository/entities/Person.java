package com.asmathic.eldar.eldarback.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PERSONS")
@Getter
@Setter
// Lombok failing locally ( I should solve it using kotlin data classes I know.. too late)
public class Person {

    @Id
    @Column(name = "DNI")
    private String dni;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    // In a better version of the app should be a foreign key to an intermediate table 'invitations'
    // and that way support many birthdays
    @Column(name = "PARTY_ID")
    private Integer partyId;

    public Person invite() {
        this.partyId = 1;
        return this;
    }
}
