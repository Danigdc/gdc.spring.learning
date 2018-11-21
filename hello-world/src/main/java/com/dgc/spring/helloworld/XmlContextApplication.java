package com.dgc.spring.helloworld;

import com.dgc.spring.helloworld.basic.BinarySearchImpl;
import com.dgc.spring.helloworld.scope.PersonDAO;
import com.dgc.spring.helloworld.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentscanScopeApplication.class);

	public static void main(String[] args) {

        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("beans -> {}", (Object) applicationContext.getBeanDefinitionNames());

            System.out.println(xmlPersonDAO);
            System.out.println(xmlPersonDAO.getXmlJdbcConnection());

            LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
        }

        //applicationContext.close(); - instead of try
	}
}
