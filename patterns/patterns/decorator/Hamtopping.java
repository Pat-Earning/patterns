package patterns.decorator;

public class Hamtopping extends ToppingDecorator {
    
    Pizza pizza;
    
    public Hamtopping(Pizza pizza) {
        this.pizza = pizza;

    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", ham";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 5;
    }
    
}