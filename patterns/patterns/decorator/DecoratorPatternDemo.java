package patterns.decorator;

public class DecoratorPatternDemo {
    
    Pizza pizza = new ThincrustPizza();
    
    public void main() {
        System.out.println ("empty pizza: " + pizza.getDescription() + ". Price: " + pizza.cost() );
        
        pizza = new Tomatotopping(pizza);
        pizza = new Cheesetopping(pizza);
        pizza = new Hamtopping(pizza);
        
        System.out.println ("full pizza: " + pizza.getDescription() + ". Price: " + pizza.cost() );
        
        Pizza margarita = new ThincrustPizza();
        margarita = new Tomatotopping(margarita);
        margarita = new Cheesetopping(margarita);
        System.out.println ("margarita pizza: " + margarita.getDescription() + ". Price: " + margarita.cost() );
        
    }

        
}
