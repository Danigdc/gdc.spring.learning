package com.gdc.spring.database.databasedemo;

import com.gdc.spring.database.databasedemo.entities.Person;
import com.gdc.spring.database.databasedemo.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication Keep away from component scan to run JPA impl
public class JdbcDatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10001 -> {}", dao.findById(10001));
        logger.info("Delete id 10002 -> No of rows deleted - {}", dao.deleteById(10002));
        logger.info("Inserting 10004-> {}", dao.insert(
                new Person(10004, "Couri", "Benasque", new Date())
        ));
        logger.info("Updating 10003-> {}", dao.update(
                new Person(10003, "Couri", "Madrid", new Date())
        ));
	}
}
