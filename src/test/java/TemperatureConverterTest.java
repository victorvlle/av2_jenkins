package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void converterFahrenheitParaCelsius_comFahrenheitNegativo_deveRetornarCelsiusNegativo() {
        double fahrenheit = -100;
        double celsiusEsperado = -73.33333333333333;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    @Test
    public void converterFahrenheitParaCelsius_comFahrenheitZero_deveRetornarCelsiusZero() {
        double fahrenheit = 0;
        double celsiusEsperado = 0;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    @Test
    public void converterFahrenheitParaCelsius_comFahrenheitPositivo_deveRetornarCelsiusPositivo() {
        double fahrenheit = 100;
        double celsiusEsperado = 37.77777777777778;

        double celsiusRetornado = converterFahrenheitParaCelsius(fahrenheit);

        assertEquals(celsiusEsperado, celsiusRetornado);
    }

    private double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
