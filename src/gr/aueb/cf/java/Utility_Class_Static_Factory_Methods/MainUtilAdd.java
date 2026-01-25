package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Uses utility class AddUtil.
 */
public class MainUtilAdd {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println(AddUtil.add(num1, num2));
        System.out.println(AddUtil.sub(num1, num2));
        System.out.println(AddUtil.mul(num1, num2));
        System.out.println(AddUtil.div(num1, num2));
        System.out.println(AddUtil.mod(num1, num2));
    }
}