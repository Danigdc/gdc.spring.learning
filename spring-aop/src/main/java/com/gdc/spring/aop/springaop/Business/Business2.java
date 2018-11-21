package com.gdc.spring.aop.springaop.Business;

import com.gdc.spring.aop.springaop.Data.Data2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Data2 data2;

    public String calculateSomething(){
        return data2.retrieveSomething();
    }
}
