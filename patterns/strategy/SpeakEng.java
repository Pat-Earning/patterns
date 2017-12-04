package patterns.strategy;

public class SpeakEng implements SpeakStrategy {
   @Override
   public String speak() {
      return "Hello";
   }
}