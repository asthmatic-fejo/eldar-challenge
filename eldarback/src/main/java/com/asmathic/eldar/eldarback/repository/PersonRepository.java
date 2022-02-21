package com.asmathic.eldar.eldarback.repository;

import com.asmathic.eldar.eldarback.repository.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

}
