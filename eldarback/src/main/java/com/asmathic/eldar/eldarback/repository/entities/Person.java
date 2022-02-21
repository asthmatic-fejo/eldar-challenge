package com.asmathic.eldar.eldarback.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PERSONS")
public class Person {

    @Id
    @Column(name = "DNI")
    private String dni;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;
}
