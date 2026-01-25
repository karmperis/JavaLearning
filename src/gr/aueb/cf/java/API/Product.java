package gr.aueb.cf.cf9.exercises.API;

/**
 * Product Java Bean with API.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){

    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.out.println("Please enter a positive number!!!");
            return;
        }
        this.quantity = quantity;
    }

    /**
     * This method decreases stock.
     * Checks if the amount is sufficient, positive number, bigger than zero
     * and subtracts it from the quantity.
     * @param amount The amount who decreases the quantity.
     */
    public void sell(int amount){
       if(amount > this.quantity){
           System.out.println("Insufficient stock");
           return;
       }
       if (amount < 0 || amount == 0) {
           System.out.println("Invalid quantity");
           return;
       }
           this.quantity -= amount;
           System.out.printf("Sale successful! New quantity: %d\n", this.quantity);
    }

    /**
     * This method increases the stock.
     * Checks if the amount is positive and add it in the quantity.
     * @param amount The amount who increases the quantity.
     */
    public void restock(int amount){
        if(amount < 0 || amount == 0){
            System.out.println("The amount must be a positive number.");
            return;
        }
        this.quantity += amount;
        System.out.printf("Buy successful! New quantity: %d\n", this.quantity);
    }

    public String productToString(){
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", quantity=" + this.quantity +
                '}';
    }
}