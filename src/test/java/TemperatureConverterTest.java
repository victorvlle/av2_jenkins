package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TemperatureConverterTest {

    @Test
    public void testeFailure(){
        assertEquals(-20, TemperatureConverter.fahrenheitToCelsius(30), 0.0);
    }

    @Test
    public void testeSuccess(){
        assertEquals(-12.2222, TemperatureConverter.fahrenheitToCelsius(10), 0.0);
    }

    @Test
    public void testeSuccess2(){
        assertEquals(-12.2222, TemperatureConverter.fahrenheitToCelsius(10), 0.0);
    }
}

