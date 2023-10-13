import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {

        double fahrenheit1 = 32.0;
        double expectedCelsius1 = 0.0;
        double result1 = TemperatureConverter.fahrenheitToCelsius(fahrenheit1);
        assertEquals(expectedCelsius1, result1, 0.001);


        double fahrenheit2 = 68.0;
        double expectedCelsius2 = 20.0;
        double result2 = TemperatureConverter.fahrenheitToCelsius(fahrenheit2);
        assertEquals(expectedCelsius2, result2, 0.001);

        double fahrenheit3 = -22.0;
        double expectedCelsius3 = -30.0;
        double result3 = TemperatureConverter.fahrenheitToCelsius(fahrenheit3);
        assertEquals(expectedCelsius3, result3, 0.001);
    }


}
