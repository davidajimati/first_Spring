package com.springProject.service;

import com.springProject.dao.PersonDao;
import com.springProject.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public static int addPerson(Person person) {
        return personDao.insertPerson(person.getId(),person);
    }
}
