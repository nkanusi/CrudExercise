package com.personalproject.crud.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class PersonService {

 @Autowired
 public PersonRepository personRepository;

 public Person saveSinglePerson(Person person){
     return personRepository.save(person);
 }

 public List<Person> saveAllPeople( List<Person> people){
     return personRepository.saveAll(people);
 }

 public List<Person> getPeople (){
     return personRepository.findAll();
 }

 public Person getPersonById(Long id){
     return personRepository.findById(id).orElse(null);
 }

 public Person getPersonByName(String name){
     return personRepository.findByName(name);
 }

 public String deletePerson(Long id){
     personRepository.deleteById(id);
     return "Person's information removed " + id;
 }

 public Person updatePerson(Person person){
     Person existingPerson = personRepository.findById(person.getId()).orElse(person);
     existingPerson.setAge(person.getAge());
     existingPerson.setName(person.getName());
     existingPerson.setHobby(person.getHobby());
     return personRepository.save(existingPerson);

 }
}

