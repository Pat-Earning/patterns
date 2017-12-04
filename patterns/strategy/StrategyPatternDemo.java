package patterns.strategy;

public class StrategyPatternDemo {
    public static void main() {
    
        Individual englishman = new Individual(new SpeakEng());	
        Individual spaniard = new Individual(new SpeakSpa());	
        Individual swede = new Individual(new SpeakSwe());	
        
        System.out.println(englishman.speakNow());  
        System.out.println(spaniard.speakNow());  
        System.out.println(swede.speakNow());  
    }

}
