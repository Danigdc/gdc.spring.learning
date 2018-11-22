package com.gdc.spring.database.databasedemo.springdata;

import com.gdc.spring.database.databasedemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
