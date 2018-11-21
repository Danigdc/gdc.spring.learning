package com.dgc.spring.helloworld.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgoritm{
    public int[] Sort(int[] numbers){
        //logic
        return numbers;
    }
}
