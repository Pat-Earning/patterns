package patterns.strategy;

public class SpeakSpa implements SpeakStrategy {
   @Override
   public String speak() {
      return "iHola!";
   }
}