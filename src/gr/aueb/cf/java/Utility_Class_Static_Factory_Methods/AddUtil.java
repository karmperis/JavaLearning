package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Utility class.
 */
public class AddUtil {

    private AddUtil(){

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        return num1 / num2;
    }

    public static int mod(int num1, int num2){
        return num1 % num2;
    }
}