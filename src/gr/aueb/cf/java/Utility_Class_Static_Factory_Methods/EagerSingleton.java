package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Singleton eager instantiation.
 */
public class EagerSingleton {
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}