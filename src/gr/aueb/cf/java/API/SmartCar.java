package gr.aueb.cf.cf9.exercises.API;

/**
 * Smart car class.
 */
public class SmartCar {
    // Class fields.
    private String brand;
    private double fuel;
    private final double maxFuel;
    private int km;
    private final double litresPerKm;

    // Overload constructor.
    public SmartCar(String brand){
        this.brand = brand;
        fuel = 0.0;
        km = 0;
        maxFuel = 50;
        litresPerKm = 0.1;
    }

    // Get brand.
    public String getBrand(){
        return this.brand;
    }

    // Set brand.
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * Checks if the amount of fuel is appropriate for refuel.
     * @param amount Given fuel amount.
     */
    public void refuel(double amount){

        if(amount <= 0){
            System.out.println("The amount must be a positive number bigger than zero.");
            return;
        }
        if(amount + fuel > maxFuel) {
            double amountAdded = 0;

            amountAdded = maxFuel - fuel;
            fuel = maxFuel;
            System.out.printf("Tank is full! Only %.1f litres fit in the tank.\n", amountAdded);
        }else {
            fuel += amount;
            System.out.printf("You put %.1f litres of gasoline. Total fuel: %.1f\n", amount, fuel);
        }
    }

    /**
     * Checks if the fuel is sufficient for the given distance.
     * @param distance Given distance.
     */
    public void drive(int distance){
        double fuelNeeded = distance * litresPerKm;

        if(fuelNeeded > fuel){
            System.out.printf("The fuel consumption is not sufficient for %d km distance.\n", distance);
        } else {
            fuel -= fuelNeeded;
            km += distance;
            System.out.printf("You have driven %d km. Fuel remaining: %.1f liters.\n", distance, fuel);

        }
    }

    /**
     * Returns car details.
     * @return Car details.
     */
    @Override
    public String toString() {
        return "SmartCar{" +
                "brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", km=" + km +
                '}';
    }
}