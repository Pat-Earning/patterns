package patterns.strategy;

public class SpeakSwe implements SpeakStrategy {
   @Override
   public String speak() {
      return "Hej!";
   }
}