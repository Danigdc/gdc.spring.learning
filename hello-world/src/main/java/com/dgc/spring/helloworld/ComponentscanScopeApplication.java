package com.dgc.spring.helloworld;

import com.dgc.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dgc.spring.componentscan")
public class ComponentscanScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentscanScopeApplication.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentscanScopeApplication.class)) {

            ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

            LOGGER.info("{}", componentDAO);
        }
	}
}
