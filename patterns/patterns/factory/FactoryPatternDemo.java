package patterns.factory;

public class FactoryPatternDemo {
    public static void main() {
        System.out.println("Welcome to the dealership");
        
        Carfactory bmwfactory = new BmwCarfactory();
        Carfactory porschefactory = new PorscheCarfactory();
        
        // The creation of the Carproduct is delegated (deferred) to a concrete factory
        Carproduct car = bmwfactory.produceCar("fullsize");
        System.out.println(car.getDescription());
        Carproduct car2 = bmwfactory.produceCar("sport");
        System.out.println(car2.getDescription());
                
        Carproduct car3 = porschefactory.produceCar("fullsize");
        System.out.println(car3.getDescription());
        Carproduct car4 = porschefactory.produceCar("sport");
        System.out.println(car4.getDescription());
        
    }
}
