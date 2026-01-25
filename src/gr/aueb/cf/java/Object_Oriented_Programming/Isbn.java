package gr.aueb.cf.cf9.exercises.Object_Oriented_Programming;

// Immutable class
public final class Isbn {
    private final String code;

    public Isbn(String code){
        this.code = code;
    }

    public String getIsbn(){
        return this.code;
    }
}
