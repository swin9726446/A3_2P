package com.example.a9726446.a3_2p;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 9726446 on 29/8/18 @ LB1-MAC-024
 */
public class ConverterTest {
    private Converter converter;

    @Before
    public void setUp() throws Exception{
        converter = new Converter();
    }

    @Test
    public void ftTest() throws Exception{
        //expect 60.96, given 2ft
        assertEquals("60.96 cm", converter.Convert("0","2","0",false));
    }

    @Test
    public void inTest() throws Exception{
        //expect 60.96, given 2ft
        assertEquals("15.24 cm", converter.Convert("0","0","6",false));
    }
}
