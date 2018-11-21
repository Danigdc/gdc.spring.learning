package com.gdc.mockito.mockitobasics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.FindTheGreatestFromAllData();
        assertEquals(24, result);
    }

    class DataServiceStub implements DataService {
        @Override
        public int[] retrieveAllData(){
            return new int[] { 24, 6, 15 };
        }
    }

}
