package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * Uses AppConfig class.
 */
public class MainAppConfig {
    public static void main(String[] args) {

        AppConfig app = AppConfig.getInstance();
        app.showConfig();
    }
}