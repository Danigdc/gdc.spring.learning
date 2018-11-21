package com.dgc.spring.helloworld;

import com.dgc.spring.helloworld.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {

            SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

            System.out.println(someExternalService.returnServiceUrl());
        }
	}
}
