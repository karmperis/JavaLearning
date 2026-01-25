package gr.aueb.cf.java.Interfaces;

/**
 * Composition με interface.
 */
public class GenericSpeakingSchool{
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }

}
