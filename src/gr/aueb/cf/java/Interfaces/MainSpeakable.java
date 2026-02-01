package gr.aueb.cf.java.Interfaces;

/**
 * Main uses ISpeakable interface and classes Cat, Dog and GenericSpeakingSchool.
 */
public class MainSpeakable {
    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob");
        GenericSpeakingSchool catSchool = new GenericSpeakingSchool(alice);
        GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(bob);

        doSpeak(alice);
        doSpeak(bob);
        catSchool.learnToSpeak();
        dogSchool.learnToSpeak();

    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();}
}