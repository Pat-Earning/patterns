package patterns.decorator;

public class DecoratorPatternDemo {
    
    Pizza pizza = new ThincrustPizza();
    
    public void main() {
        System.out.println ("empty pizza: " + pizza.getDescription() + " price: " + pizza.cost() );
        
        pizza = new Tomatotopping(pizza);
        pizza = new Cheesetopping(pizza);
        pizza = new Hamtopping(pizza);
        
        System.out.println ("full pizza: " + pizza.getDescription() + " price: " + pizza.cost() );
        
        
    }

        
}
