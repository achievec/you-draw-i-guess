package org.aloha.youdrawiguess.service;

import org.aloha.youdrawiguess.YouDrawIGuessApplicationTests;
import org.aloha.youdrawiguess.entity.Person;
import org.aloha.youdrawiguess.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

public class PersonRepositoryTest extends YouDrawIGuessApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    private Long id;

    @Before
    public void setUp(){
        Person person=new Person();
        person.setAge(123);
        person.setName("abc");
        id =personRepository.save(person).getId();
    }

    @Test
    public void testFind(){
        Optional<Person> person=personRepository.findById(id);
        System.out.println(person.isPresent()? person.get().getName():"not found");
    }

}
