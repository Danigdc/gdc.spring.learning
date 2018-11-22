package com.gdc.spring.database.databasedemo;

import com.gdc.spring.database.databasedemo.entities.Person;
import com.gdc.spring.database.databasedemo.jpa.PersonJpaRepository;
import com.gdc.spring.database.databasedemo.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonSpringDataRepository dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

        logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("All users -> {}", dao.findAll());
		dao.deleteById(10002);
        logger.info("Inserting 10004-> {}", dao.save(
                new Person("Couri", "Benasque", new Date())
        ));
        logger.info("Updating 10003-> {}", dao.save(
                new Person(10003, "Couri", "Madrid", new Date())
        ));
	}
}
