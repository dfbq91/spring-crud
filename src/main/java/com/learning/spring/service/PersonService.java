/* Service is a class with public methods. It contains,
business layer i.e, business logic, where data is manipulated
and converted into content suitable for presentation */

package com.learning.spring.service;

import com.learning.spring.dao.PersonDao;
import com.learning.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service // Indicates this class contains the business layer
public class PersonService {

    private final PersonDao personDao;

    @Autowired // For injecting, it means, auto-wiring in PersonDao interface
    /* Because of we can have multiple implementations of,
    PersonDao interface, we have to use @Qualifier to indicate
    then in @Repository which implementation is used */
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newPerson) {
        return personDao.updatePersonById(id, newPerson);
    }
}
