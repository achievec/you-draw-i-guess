package org.aloha.youdrawiguess.repository;

import org.aloha.youdrawiguess.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Long> {

}

