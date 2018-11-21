package com.dgc.spring.helloworld;

import com.dgc.spring.helloworld.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloWorldApplication {

	public static void main(String[] args) {

        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldApplication.class)) {

            BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

            int result = binarySearch.BinarySearch(new int[]{4, 3, 5}, 5);
            System.out.println(result);
        }

        //applicationContext.close(); - instead of try
	}
}
