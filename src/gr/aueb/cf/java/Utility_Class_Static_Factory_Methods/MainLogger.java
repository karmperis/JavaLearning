package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Uses logger class.
 */
public class MainLogger {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        Logger log1 = Logger.getInstance();

        log.logMessage("The new instance created.");
        log1.logMessage("The instance already exists.");
    }
}