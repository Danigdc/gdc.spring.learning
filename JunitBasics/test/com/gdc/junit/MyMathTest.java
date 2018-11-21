package com.gdc.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

    @Test
    public void sum_with3numbers(){
        System.out.println("sum_with3numbers");
        int result = myMath.sum(new int[]{1,2,3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1numbers(){
        System.out.println("sum_with1numbers");
        int result = myMath.sum(new int[]{3});
        assertEquals(3, result);
    }
}
