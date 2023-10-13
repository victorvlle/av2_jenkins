public class TemperatureConverter {

    // Método para converter de Fahrenheit para Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    // Método para converter de Celsius para Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        double fahrenheit = 212.0; // 212 graus Fahrenheit (água fervendo)
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F é igual a " + celsius + "°C");

        double celsiusValue = 100.0; // 100 graus Celsius (ponto de ebulição da água)
        double fahrenheitValue = celsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + "°C é igual a " + fahrenheitValue + "°F");
    }
}
