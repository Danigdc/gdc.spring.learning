package com.dgc.spring.helloworld.basic;

import com.dgc.spring.helloworld.HelloWorldApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the conte xt
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinaryXmlConfigurationTest {

    //Get the bean
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        assertEquals(3, binarySearch.BinarySearch(new int[] {}, 5));
    }
}
