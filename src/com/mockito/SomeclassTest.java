package com.mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by sbt-ganiev-ar on 28.07.2017.
 */
public class SomeclassTest {


    // tells mockito to create the mocks based on the @Mock annotation
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    public void testMultiple1() {
        Someclass test = mock(Someclass.class);
        when(test.multiple(10)).thenReturn(20);
        Assert.assertEquals(test.multiple(10), 20);
    }

    @Test
    public void testMultiple2() {

        Someclass test = mock(Someclass.class);
        when(test.multiple(anyInt())).thenReturn(20);
        Assert.assertEquals(test.multiple(10), 20);
    }

    @Test(expected = RuntimeException.class)
    public void testMultiple3() {
        Someclass test = mock(Someclass.class);
        doReturn(44).when(test.multiple(anyInt()));
        Assert.assertEquals(test.multiple(10), 44);
    }

    @Test(expected = RuntimeException.class)
    public void testMultiple4() {
        Integer testInt = 10;
        Integer spy = Mockito.spy(testInt);

        when(spy.equals(999)).thenReturn(true);

        Assert.assertEquals(true, spy.equals(999));
    }






}