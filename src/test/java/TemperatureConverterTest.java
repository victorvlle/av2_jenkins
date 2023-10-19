package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TemperatureConverterTest {

    @Test
    public void testeSuccess(){
        assertEquals(-12.2222, TemperatureConverter.fahrenheitToCelsius(10), 0.0);
        assertEquals(33.8, TemperatureConverter.celsiusToFahrenheit(1), 0.0);
        assertEquals(41.0, TemperatureConverter.celsiusToFahrenheit(5.0), 0.0);
    }
/* 
    @Test
    public void testeFailure(){
        assertEquals(-1.11111, TemperatureConverter.fahrenheitToCelsius(30), 0.0);
        assertEquals(86.0,TemperatureConverter.celsiusToFahrenheit(31.0),0.0);
        assertEquals(123.44,TemperatureConverter.celsiusToFahrenheit(65.6), 0.0);
    }

    @Test
    public void testeUninstable(){
        assertEquals(-12.2222, TemperatureConverter.fahrenheitToCelsius(10), 0.0);
        assertEquals(33.8, TemperatureConverter.celsiusToFahrenheit(1), 0.0);
        assertEquals(-15.0, TemperatureConverter.fahrenheitToCelsius(5.0), 0.0);
    }
*/
}

