package com.personalproject.crud.firstproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PERSON_TBL")
public class Person {

   @Id
   @GeneratedValue
   private Long id;
   private String name;
   private Integer age;
   private String hobby;

}
