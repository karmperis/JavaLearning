package gr.aueb.cf.cf9.exercises.Object_Oriented_Programming;

public class Student {
    // Static field
    private static int studentsCount;

    // Fields - Class data
    private int id;
    private String firstName;
    private String lastName;

    // Static block: Runs only one time on class load
    static{
        studentsCount = 0;
    }

    // Default Constructor
    public Student(){
        studentsCount++; // Static
    }

    // Overloaded constructor
    public Student( int id, String firstName, String lastName){
        this(); // Read default constructor

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Getters = return - Setters = void

    // Getter
    public int getId(){
        return id;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }

    // Getter
    public String getFirstName(){
        return firstName;
    }

    // Setter
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    // Getter
    public String getLastName(){
        return lastName;
    }

    // Setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Static method
    public static int getStudentsCount() {
        return studentsCount;
    }
}