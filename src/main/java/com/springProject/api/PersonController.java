package com.springProject.api;

import com.springProject.model.Person;
import com.springProject.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person){
        PersonService.addPerson(person);

    }
}
