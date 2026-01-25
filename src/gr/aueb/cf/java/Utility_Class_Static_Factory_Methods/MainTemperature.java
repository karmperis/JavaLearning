package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Uses temperature class.
 */
public class MainTemperature {
    public static void main(String[] args) {

        Temperature celsius = Temperature.fromCelsius(25);
        Temperature convertedCelsius = Temperature.fromFahrenheit(77);

        System.out.println(celsius.getCelsius());
        System.out.println(convertedCelsius.getCelsius());
    }
}