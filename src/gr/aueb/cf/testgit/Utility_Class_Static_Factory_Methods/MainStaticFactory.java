package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Uses PointStaticFactory class.
 */
public class MainStaticFactory {
    public static void main(String[] args) {
        PointStaticFactory point = PointStaticFactory.getInstance();
        PointStaticFactory pointRandom = PointStaticFactory.getRandomPoint();

        System.out.println(pointRandom.getX());
        System.out.println(pointRandom.getY());
    }
}