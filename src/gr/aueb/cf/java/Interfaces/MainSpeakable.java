package gr.aueb.cf.java.Interfaces;

/**
 * Main uses ISpeakable interface and classes Cat, Dog and GenericSpeakingSchool.
 */
public class MainSpeakable {
    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob");
        ISpeakable whiteCat = new Cat("White cat");

        doSpeak(alice);
        doSpeak(bob);
        doSpeak(whiteCat);

    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();}
}