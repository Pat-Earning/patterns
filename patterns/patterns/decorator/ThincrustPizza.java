package patterns.decorator;

public class ThincrustPizza extends Pizza {
    
    public ThincrustPizza(){
        description = "Thincrust pizza";
        
    }
    
    @Override
    public double cost() {
        return 20;
    }

}
