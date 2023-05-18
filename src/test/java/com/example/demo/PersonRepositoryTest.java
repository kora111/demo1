package com.example.demo;
import com.example.demo.entity.Discuss;
import com.example.demo.entity.Person;
import com.example.demo.repository.DiscussRepository;
import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository personrepository;
    @Test
    public void testSavePerson() {
        Person person = new Person();
        person.setFirstname("liu");
        person.setLastname("zheng");
        personrepository.save(person);
    }
    @Test
    public void testFindByPersonFirstname() {
        Person person = new Person();
        System.out.printf(personrepository.findByFirstname("liu").toString());
    }

}
