package com.example.demo.DAO;

import com.example.demo.Entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonDAO extends MongoRepository<Person,Integer> {
}
