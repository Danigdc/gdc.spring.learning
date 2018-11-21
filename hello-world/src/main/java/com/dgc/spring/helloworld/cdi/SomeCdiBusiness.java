package com.dgc.spring.helloworld.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDAO someCdiDAO;

    public SomeCdiDAO getSomeCdiDAO() {
        return someCdiDAO;
    }

    public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
        this.someCdiDAO = someCdiDAO;
    }

    public int findGreatest() {
        int[] data = someCdiDAO.getData();
        int greatest = Integer.MIN_VALUE;
        for (int value: data) {
            if(value > greatest){
                greatest = value;
            }
        }
        return  greatest;
    }

}
