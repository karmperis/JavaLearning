package gr.aueb.cf.cf9.exercises.Utility_Class_Static_Factory_Methods;

/**
 * AppConfig class with eager instantiation singleton pattern.
 */
public class AppConfig {
    private final static AppConfig instance = new AppConfig();

    private AppConfig(){

    }

    public static AppConfig getInstance(){
        return instance;
    }

    public void showConfig(){
        System.out.println("Config loaded.");
    }
}