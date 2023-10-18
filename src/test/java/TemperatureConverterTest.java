package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TemperatureConverterTest {

/*
    @Test
    public void teste_neg() {
        double fahrenheit = -100;
        double celsiusEsperado = -73.33333333333333;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    @Test
    public void test_zero() {
        double fahrenheit = 0;
        double celsiusEsperado = 0;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    @Test
    public void test_posi() {
        double fahrenheit = 100;
        double celsiusEsperado = 37.77777777777778;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    private double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
*/
    @Test
    public void testeFailure(){
        FahrenheitToCelsius fahrenheitToCelsius = new TemperatureConverter();
        assertEquals(-73.33333333333333,fahrenheitToCelsius.TemperatureConverter(-100));
    }
}

