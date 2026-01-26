package gr.aueb.cf.java.Interfaces;

/**
 * Dog class implements ISpeakable interface.
 */
public class Dog implements ISpeakable {
    private String name;

    public Dog(){

        }

        public Dog(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        @Override
        public void speak(){
            System.out.println(name + " says Hello!");
        }
    }