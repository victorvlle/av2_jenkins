package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TemperatureConverterTest {

    @Test
    public void testeFailure(){
        assertEquals(50.0, TemperatureConverter.celsiusToFahrenheit(10.0), 0.0); //correto: 10C
    }

    @Test
    ublic void testeSuccess(){
        assertEquals(104.0, TemperatureConverter.celsiusToFahrenheit(40.0), 0.0);//correto: 40C
    }

    @Test
    public void testeSuccess2(){
        assertEquals(41.0, TemperatureConverter.celsiusToFahrenheit(5.0), 0.0);//correto: 5C
    }
}

