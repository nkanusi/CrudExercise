package com.personalproject.crud.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person){
        return personService.saveSinglePerson(person);
    }

    @PostMapping("/addPersons")
    public List<Person> addPerson(@RequestBody List<Person> people){
        return personService.saveAllPeople(people);
    }

    @GetMapping("/readPeople")
    public List<Person> readPeople(){
        return personService.getPeople();
    }

    @GetMapping("/readPersonById/{id}")
    public Person readPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/readPersonByName/{name}")
    public Person readPersonById(@PathVariable String name){
        return personService.getPersonByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deletePerson(@PathVariable Long id){
        return personService.deletePerson(id);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }
}
