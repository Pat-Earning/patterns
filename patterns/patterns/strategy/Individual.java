package patterns.strategy;

public class Individual {
   private SpeakStrategy speakbehaviour;

   public Individual(SpeakStrategy speakbehaviour) {
      this.speakbehaviour = speakbehaviour;
   }

   public String speakNow() {
      return speakbehaviour.speak();
   }
}
