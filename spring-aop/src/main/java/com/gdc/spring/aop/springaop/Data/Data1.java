package com.gdc.spring.aop.springaop.Data;

import com.gdc.spring.aop.springaop.Aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Data1 {

    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
