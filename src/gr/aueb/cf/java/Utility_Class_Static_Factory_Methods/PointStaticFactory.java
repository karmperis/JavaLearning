package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Static factory methods.
 */

import java.util.Random;

public class PointStaticFactory {
    private int x;
    private int y;

    private PointStaticFactory(){

    }

    private PointStaticFactory( int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public static PointStaticFactory getInstance(){
        return new PointStaticFactory();
    }

    public static PointStaticFactory getRandomPoint(){
        final int BOUND = 101;
        Random random = new Random();
        return new PointStaticFactory(random.nextInt(BOUND), random.nextInt(BOUND));
    }
}