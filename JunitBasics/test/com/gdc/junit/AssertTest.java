package com.gdc.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void test(){
        assertEquals(1,1);
        assertTrue(true);
        assertFalse(false);
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
    }

}
