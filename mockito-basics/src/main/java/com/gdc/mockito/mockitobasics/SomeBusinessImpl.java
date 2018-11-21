package com.gdc.mockito.mockitobasics;

import javax.xml.crypto.Data;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int FindTheGreatestFromAllData(){
        int[] numbers = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value: numbers) {
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
