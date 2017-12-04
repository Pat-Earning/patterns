package patterns.decorator;

public abstract class Pizza {
    
    String description = "Unknown pizza";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
