package patterns.decorator;

public class Tomatotopping extends ToppingDecorator {
    
    Pizza pizza;
    
    public Tomatotopping(Pizza pizza) {
        this.pizza = pizza;

    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", tomato";
    }
    
    @Override
    public double cost() {
        return pizza.cost() + 2;
    }
    
}
