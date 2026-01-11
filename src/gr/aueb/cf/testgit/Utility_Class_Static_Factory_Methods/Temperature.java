package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Exercise: Named Static Factories
 */
public class Temperature {
    private double celsius;

    private Temperature(double celsius){
        this.celsius = celsius;
    }

    public double getCelsius(){
        return this.celsius;
    }

    public static Temperature fromCelsius(double celsius){
        return new Temperature(celsius);
    }

    public static Temperature fromFahrenheit(double val){
        double fahrenheit = (val - 32) * 5 / 9;
        return new Temperature(fahrenheit);
    }
}