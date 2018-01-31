package patterns.decorator;

public class Cheesetopping extends ToppingDecorator {
    
    Pizza pizza;
    
    public Cheesetopping(Pizza pizza) {
        this.pizza = pizza;

    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 6;
    }
    
}
