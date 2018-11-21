package com.gdc.mockito.mockitobasics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataserviceMock = mock(DataService.class);
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataserviceMock);
        int result = someBusiness.FindTheGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue() {
        DataService dataserviceMock = mock(DataService.class);
        when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {15});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataserviceMock);
        int result = someBusiness.FindTheGreatestFromAllData();
        assertEquals(15, result);
    }

}
