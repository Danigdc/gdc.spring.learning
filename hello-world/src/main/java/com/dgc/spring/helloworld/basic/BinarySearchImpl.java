package com.dgc.spring.helloworld.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgoritm sortAlgoritm;

    public int BinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgoritm.Sort(numbers);
        System.out.println(sortAlgoritm);
        //Logic
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("preDestroy");
    }
}
