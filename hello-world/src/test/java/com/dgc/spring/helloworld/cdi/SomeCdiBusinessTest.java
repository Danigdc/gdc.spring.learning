package com.dgc.spring.helloworld.cdi;

import com.dgc.spring.helloworld.CdiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    //Inject Mock
    @InjectMocks
    private SomeCdiBusiness business;

    //Create Mock
    @Mock
    private SomeCdiDAO daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
        assertEquals(2, business.findGreatest());
    }
}
