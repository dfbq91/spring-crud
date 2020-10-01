package com.learning.spring.api;

import com.learning.spring.model.Person;
import com.learning.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person") // URL where request are sent
@RestController // Allow to indicate an endpoint and a response
public class PersonController {

    private final PersonService personService;

    @Autowired // Allows to inject the service into this constructor
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping // Indicates this method will be used for POST requests
    // @RequestBody indicates that the body contains a Person object
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping // Indicated this method will be used for GET requests
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}") // This id goes in the URL
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @RequestBody Person personToUpdate) {
        personService.updatePerson(id, personToUpdate);
    }

}
