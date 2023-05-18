package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByFirstname(String firstname);
}
