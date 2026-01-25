package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Logger class with lazy instantiation singleton pattern.
 */
public class Logger {

    private static Logger instance;

    private Logger(){

    }

    public static Logger getInstance(){
        if(instance == null){
            instance =  new Logger();
        }
        return instance;
    }

    public void logMessage(String message){
        System.out.println("Log: " + message);
    }
}